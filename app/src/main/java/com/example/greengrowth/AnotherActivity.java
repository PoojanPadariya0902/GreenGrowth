package com.example.greengrowth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    TextView mTitleTv, mDescTv;
    ImageView mImageIv;
    ImageButton another_back;

    CardView s_t_lab_btn, s_utilization, s_importance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        mTitleTv = findViewById(R.id.title_txt);
        mDescTv = findViewById(R.id.description_txt);
        mImageIv = findViewById(R.id.imageView);
        another_back = findViewById(R.id.another_bk);
        s_t_lab_btn = findViewById(R.id.s_t_lab_c);
        s_utilization = findViewById(R.id.s_fertilizer_utilization_c);
        s_importance = findViewById(R.id.s_importancec_of_micro_c);

        another_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDecs");

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");
        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0, mBytes.length);

        mTitleTv.setText(mTitle);
        mDescTv.setText(mDescription);
        mImageIv.setImageBitmap(bitmap);

        s_t_lab_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnotherActivity.this, s_t_lab.class));
            }
        });

        s_utilization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnotherActivity.this, s_utilization_fertil.class));
            }
        });

        s_importance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnotherActivity.this, s_importance_micro.class));
            }
        });

    }
}
