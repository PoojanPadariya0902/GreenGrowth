package com.example.greengrowth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class already_user extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseUser mCurrentUser;

    EditText mEmail;
    EditText mPassword;
    Button mResetPass;

    private Button mGenerateButton;
    private ProgressBar mLoginProgress;
    private TextView mLoginFeedback;

    ImageButton already_bk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_already_user);

        mAuth = FirebaseAuth.getInstance();
        mCurrentUser = mAuth.getCurrentUser();

        mEmail = findViewById(R.id.email_txt);
        mPassword = findViewById(R.id.password_txt);
        mResetPass = findViewById(R.id.reset_pass);

        mGenerateButton = findViewById(R.id.button);
        mLoginProgress = findViewById(R.id.already_progressBar);
        mLoginFeedback = findViewById(R.id.gen_feedback);

        already_bk = findViewById(R.id.already_choose_bk_btn);

        already_bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(already_user.this, choose_user.class));
                finish();
            }
        });


        mGenerateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginProgress.setVisibility(View.VISIBLE);
                mGenerateButton.setEnabled(false);

                String email = mEmail.getText().toString();
                String password = mPassword.getText().toString();

                if(email.isEmpty() || password.isEmpty()){
                    mLoginFeedback.setText("Please fill all fields.");
                    mLoginFeedback.setVisibility(View.VISIBLE);
                    mLoginProgress.setVisibility(View.INVISIBLE);
                    mGenerateButton.setEnabled(true);
                }

                else{
                    //Login to firebase will be here...

                    mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                mLoginProgress.setVisibility(View.VISIBLE);
                                mGenerateButton.setEnabled(false);
                                startActivity(new Intent(already_user.this, MainActivity.class));
                                finish();
                            }
                            else{
                                mLoginProgress.setVisibility(View.INVISIBLE);
                                mGenerateButton.setEnabled(true);
                                Toast.makeText(already_user.this,"Something goes wrong in database!",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

            }


        });


        mResetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(already_user.this);

                builder.setTitle("Reset Password");

                builder.setMessage("You have sent you a email to reset your password")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                String reset_email = mEmail.getText().toString();

                                if (reset_email.isEmpty()){
                                    Toast.makeText(already_user.this,"Please enter email for reseting your password.",Toast.LENGTH_SHORT).show();
                                }

                                else{
                                    mAuth.sendPasswordResetEmail(reset_email).addOnSuccessListener(new OnSuccessListener<Void>() {
                                        @Override
                                        public void onSuccess(Void aVoid) {
                                            Toast.makeText(already_user.this, "Reset mail is sent to your email, please check", Toast.LENGTH_SHORT).show();
                                        }
                                    }).addOnFailureListener(new OnFailureListener() {
                                        @Override
                                        public void onFailure(@NonNull Exception e) {
                                            Toast.makeText(already_user.this, "Error! Reset mail is not sent", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                }
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();

        if (mCurrentUser != null){
            SendUserToHome();
        }
    }

    public void SendUserToHome() {
        Intent otpIntent = new Intent(already_user.this, MainActivity.class);
        otpIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        otpIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(otpIntent);
        finish();
    }

}
