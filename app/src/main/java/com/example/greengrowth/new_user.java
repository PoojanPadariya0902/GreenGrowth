package com.example.greengrowth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class new_user extends AppCompatActivity {

    ImageButton new_user_bk;
    EditText mUsername_n, mPassword_n, mEmail_n;

    private Button mGenerateButton_n;
    private ProgressBar mLoginProgress_n;
    private TextView mLoginFeedback_n;

    private FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        fAuth = FirebaseAuth.getInstance();


        mGenerateButton_n = findViewById(R.id.button2);
        mLoginProgress_n = findViewById(R.id.new_progressBar);
        mLoginFeedback_n = findViewById(R.id.new_gen_feedback);

        mUsername_n = findViewById(R.id.username_txt2);
        mPassword_n = findViewById(R.id.password_txt2);
        mEmail_n = findViewById(R.id.email_txt2);
        new_user_bk = findViewById(R.id.new_user_choose_bk_btn);

        new_user_bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(new_user.this, choose_user.class));
                finish();
            }
        });


        mGenerateButton_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String username_n = mUsername_n.getText().toString();
                final String password_n = mPassword_n.getText().toString();
                final String email_n = mEmail_n.getText().toString();

                mLoginProgress_n.setVisibility(View.VISIBLE);
                mGenerateButton_n.setEnabled(false);

                if (username_n.isEmpty() || password_n.isEmpty() || email_n.isEmpty()){
                    mLoginFeedback_n.setText("Please fill all details.");
                    mLoginFeedback_n.setVisibility(View.VISIBLE);
                    mLoginProgress_n.setVisibility(View.INVISIBLE);
                    mGenerateButton_n.setEnabled(true);
                }
                else if(password_n.length() < 6){
                    mLoginFeedback_n.setText("Password must be > 6 digits.");
                    mLoginFeedback_n.setVisibility(View.VISIBLE);
                    mLoginProgress_n.setVisibility(View.INVISIBLE);
                    mGenerateButton_n.setEnabled(true);
                }
                else{
                    //Code to signup and register all details of user to firebase
                    fAuth.createUserWithEmailAndPassword(email_n,password_n).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()){

                                FirebaseDatabase database = FirebaseDatabase.getInstance();
                                DatabaseReference myref = database.getReference("user");

                                UserHelperClass helperClass = new UserHelperClass(username_n, password_n, email_n);
                                myref.child(username_n).setValue(helperClass);

                                mLoginProgress_n.setVisibility(View.VISIBLE);
                                mGenerateButton_n.setEnabled(false);
                                startActivity(new Intent(new_user.this, MainActivity.class));
                                finish();
                            }

                            else{
                                mLoginProgress_n.setVisibility(View.INVISIBLE);
                                mGenerateButton_n.setEnabled(true);
                                Toast.makeText(new_user.this,"Something goes wrong in database!",Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                }

            }
        });

    }
}
