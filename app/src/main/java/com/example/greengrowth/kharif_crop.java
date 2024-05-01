package com.example.greengrowth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class kharif_crop extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    ImageButton back_from_kharif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kharif_crop);

        back_from_kharif = findViewById(R.id.kharif_crop_bk);

        mRecyclerView = findViewById(R.id.card_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

        back_from_kharif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Paddy");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.paddy);
        models.add(m);

        m = new Model();
        m.setTitle("Castor");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.castor);
        models.add(m);

        m = new Model();
        m.setTitle("Cotton");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.cotton);
        models.add(m);

        m = new Model();
        m.setTitle("Sesame");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.sesame);
        models.add(m);

        m = new Model();
        m.setTitle("Soyabean");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.soyabean);
        models.add(m);

        return models;

    }
}
