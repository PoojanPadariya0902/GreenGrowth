package com.example.greengrowth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class have_soil_card extends AppCompatActivity {

    ImageButton back;

    TextView ph_text, fym_text, nitrogen_text, phosphorus_text, potash_text;
    Button submit_button;
    ProgressBar already_progressBar_sub_;
    TextView gen_feedback_sub_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_have_soil_card);

        back = findViewById(R.id.have_soil_bk_btn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ph_text = findViewById(R.id.ph_txt);
        fym_text = findViewById(R.id.fym_txt);
        nitrogen_text = findViewById(R.id.nitrogen_txt);
        phosphorus_text = findViewById(R.id.phosphorus_txt);
        potash_text = findViewById(R.id.potash_txt);

        submit_button = findViewById(R.id.submit_btn);
        already_progressBar_sub_ = findViewById(R.id.already_progressBar_sub);
        gen_feedback_sub_ = findViewById(R.id.gen_feedback_sub);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // We asign values to variable
                String ph = ph_text.getText().toString();
                String fym = fym_text.getText().toString();
                String nitrogen = nitrogen_text.getText().toString();
                String phosphorus = phosphorus_text.getText().toString();
                String potash = potash_text.getText().toString();

                submit_button.setEnabled(false);
                already_progressBar_sub_.setVisibility(View.VISIBLE);

                if (ph.isEmpty() || fym.isEmpty() || nitrogen.isEmpty() || phosphorus.isEmpty() || potash.isEmpty()) {
                    already_progressBar_sub_.setVisibility(View.INVISIBLE);
                    submit_button.setEnabled(true);
                    gen_feedback_sub_.setText("Please Fill Details");
                    gen_feedback_sub_.setVisibility(View.VISIBLE);
                }

                else if (Integer.parseInt(ph) > 7) {
                    already_progressBar_sub_.setVisibility(View.INVISIBLE);
                    submit_button.setEnabled(true);
                    gen_feedback_sub_.setText("Please enter PH<=7");
                    gen_feedback_sub_.setVisibility(View.VISIBLE);
                }

                else{
                    Intent intent_precaution = new Intent(have_soil_card.this, precautions.class);
                    intent_precaution.putExtra("iph",ph);
                    intent_precaution.putExtra("ifym",fym);
                    intent_precaution.putExtra("initro",nitrogen);
                    intent_precaution.putExtra("iphos",phosphorus);
                    intent_precaution.putExtra("ipota",potash);
                    startActivity(intent_precaution);
                    finish();
                }

            }
        });

    }
}
