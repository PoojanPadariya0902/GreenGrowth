package com.example.greengrowth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class soil_report_card extends AppCompatActivity {

    CardView have_soil_c,dont_have_card;

    ImageButton soil_bk_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soil_report_card);

        have_soil_c = findViewById(R.id.have_soil_card);
        soil_bk_main = findViewById(R.id.soil_report_bk);
        dont_have_card = findViewById(R.id.dont_have_soil_card);

        have_soil_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(soil_report_card.this, have_soil_card.class));
            }
        });

        soil_bk_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        dont_have_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(soil_report_card.this, new_soil_card.class));
            }
        });

    }



    @Override
    public void onBackPressed() {
        finish();
    }
}
