package com.example.greengrowth;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class summer_crop extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    ImageButton bk_to_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summer_crop);

        bk_to_home = findViewById(R.id.summer_crop_bk);

        mRecyclerView = findViewById(R.id.card_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

        bk_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Bajri");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.bajri);
        models.add(m);

        m = new Model();
        m.setTitle("Urad");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.urad);
        models.add(m);

        m = new Model();
        m.setTitle("Moong");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.moong);
        models.add(m);

        m = new Model();
        m.setTitle("Ladis Finger");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.ladisfinger);
        models.add(m);

        m = new Model();
        m.setTitle("Paddy");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.paddy);
        models.add(m);

        return models;

    }

}
