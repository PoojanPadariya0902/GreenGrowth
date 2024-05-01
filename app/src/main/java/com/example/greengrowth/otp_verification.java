package com.example.greengrowth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

public class otp_verification extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseUser mCurrentUser;

    private String mAuthVerificationID;

    private EditText mOTPtext;
    private Button mVerifyBtn;

    private ProgressBar mOTpProgress;
    private TextView mOTpFeedback;

    ImageButton back_already;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        mAuth = FirebaseAuth.getInstance();
        mCurrentUser = mAuth.getCurrentUser();

        mAuthVerificationID = getIntent().getStringExtra("AuthCredentials");

        mOTpFeedback = findViewById(R.id.otp_feedback);
        mOTpProgress = findViewById(R.id.otp_progressBar);
        mOTPtext = findViewById(R.id.otp_edittext);
        mVerifyBtn = findViewById(R.id.verify_btn);

        back_already = findViewById(R.id.otp_already_bk_btn);
        back_already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otp_bk_intent = new Intent(otp_verification.this, already_user.class);
                startActivity(otp_bk_intent);
                finish();
            }
        });

        mVerifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String otp = mOTPtext.getText().toString();

                if (otp.isEmpty()) {
                    mOTpFeedback.setText("Please fill in the form and try again.");
                    mOTpFeedback.setVisibility(View.VISIBLE);
                }
                else {

                    mOTpProgress.setVisibility(View.VISIBLE);
                    mVerifyBtn.setEnabled(false);

                    PhoneAuthCredential credential = PhoneAuthProvider.getCredential(mAuthVerificationID, otp);
                    signInWithPhoneAuthCredential(credential);
                }

            }
        });

    }


    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(otp_verification.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            SendUserToHome();
                        }
                        else {
                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                // The verification code entered was invalid
                                mOTpFeedback.setText("There was an error verifying OTP");
                                mOTpFeedback.setVisibility(View.VISIBLE);
                            }
                        }

                        mOTpProgress.setVisibility(View.INVISIBLE);
                        mVerifyBtn.setEnabled(true);
                    }
                });
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (mCurrentUser != null) {
            SendUserToHome();
        }
    }

    public void SendUserToHome() {
        Intent otpIntent = new Intent(otp_verification.this, MainActivity.class);
        otpIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        otpIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(otpIntent);
        finish();
    }
}
