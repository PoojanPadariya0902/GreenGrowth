package com.example.greengrowth;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class s_utilization_fertil extends AppCompatActivity {

    ImageButton s_utilization_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_utilization_fertil);

        s_utilization_back = findViewById(R.id.s_utilization_bk);

        s_utilization_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
