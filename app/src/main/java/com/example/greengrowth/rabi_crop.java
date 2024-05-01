package com.example.greengrowth;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rabi_crop extends AppCompatActivity{

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    ImageButton back_to_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabi_crop);

        back_to_home = findViewById(R.id.rabi_crop_bk);

        mRecyclerView = findViewById(R.id.card_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

        back_to_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Wheat");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.wheat);
        models.add(m);

        m = new Model();
        m.setTitle("Maize");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.maize);
        models.add(m);

        m = new Model();
        m.setTitle("Oats");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.oat);
        models.add(m);

        m = new Model();
        m.setTitle("Mustard");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.mustard);
        models.add(m);

        m = new Model();
        m.setTitle("Lucerne");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.lucerne);
        models.add(m);

        return models;

    }

}
