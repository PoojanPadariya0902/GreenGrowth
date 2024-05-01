package com.example.greengrowth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class choose_user extends AppCompatActivity {

    CardView already_user_j;
    CardView new_user_j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_user);

        already_user_j = (CardView) findViewById(R.id.already_user_card);
        new_user_j = (CardView) findViewById(R.id.new_user_card);

        already_user_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(choose_user.this, already_user.class));
                finish();
            }
        });

        new_user_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(choose_user.this, new_user.class));
            }
        });
    }
}
