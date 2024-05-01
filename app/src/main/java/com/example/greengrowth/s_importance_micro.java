package com.example.greengrowth;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class s_importance_micro extends AppCompatActivity {

    ImageButton s_import_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_importance_micro);

        s_import_back = findViewById(R.id.s_import_micro_bk);

        s_import_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
