package com.example.greengrowth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class new_soil_card extends AppCompatActivity {

    ImageButton new_bk;

    CardView s_s_collection_btn, s_t_lab_btn, s_utilization, s_importance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_soil_card);

        new_bk = findViewById(R.id.new_soil_report_bk);
        s_s_collection_btn = findViewById(R.id.s_s_collection_c);
        s_t_lab_btn = findViewById(R.id.s_t_lab_c);
        s_utilization = findViewById(R.id.s_fertilizer_utilization_c);
        s_importance = findViewById(R.id.s_importancec_of_micro_c);

        new_bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        s_s_collection_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(new_soil_card.this, s_s_collection.class));
            }
        });

        s_t_lab_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(new_soil_card.this, s_t_lab.class));
            }
        });

        s_utilization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(new_soil_card.this, s_utilization_fertil.class));
            }
        });

        s_importance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(new_soil_card.this, s_importance_micro.class));
            }
        });

    }
}
