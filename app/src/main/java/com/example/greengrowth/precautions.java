package com.example.greengrowth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class precautions extends AppCompatActivity {

    ImageButton home_button;
    RecyclerView jRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precautions);

        jRecyclerView = findViewById(R.id.card_list_3);
        jRecyclerView.setLayoutManager(new LinearLayoutManager(precautions.this));

        //Warning values are tested
        Intent intent_ = getIntent();
        String ph_ = intent_.getStringExtra("iph");
        String fym_ = intent_.getStringExtra("ifym");
        String nitro_ = intent_.getStringExtra("initro");
        String phos_ = intent_.getStringExtra("iphos");
        String pota_ = intent_.getStringExtra("ipota");

        //String => Integer
        int ph = Integer.parseInt(ph_);
        int fym = Integer.parseInt(fym_);
        int N = Integer.parseInt(nitro_);
        int PS = Integer.parseInt(phos_);
        int PO = Integer.parseInt(pota_);

        if (ph>=6.5 && ph<=7){
            //Maize, Oats, Paddy, Cotton, Sesame, Soyabeans, Bajri, Urad, Mung, Ladies Finger
            myAdapter = new MyAdapter(this, getMyList1());
            jRecyclerView.setAdapter(myAdapter);
        }

        if (ph>=5.5 && ph<6.5) {
            //Wheat, Maize, Mustard, Lucerne, Paddy, Castor, Cotton, Sesame, Soyabeans, Bajri, Mung, Ladies Finger
            myAdapter = new MyAdapter(this, getMyList2());
            jRecyclerView.setAdapter(myAdapter);
        }

        else {
            //Wheat, Mustard, Lucerne
            //Show alert message ("Your soil is Acidic. Please Add some Alkaline nutrients")
            myAdapter = new MyAdapter(this, getMyList3());
            jRecyclerView.setAdapter(myAdapter);
        }



        //Back to Home
        home_button = findViewById(R.id.home_bk);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(precautions.this, MainActivity.class));
                finish();
            }
        });
    }


    private ArrayList<Model> getMyList1() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Maize");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.maize);
        models.add(m);

        m = new Model();
        m.setTitle("Oats");
        m.setDescription("Oats are good for health");
        m.setImg(R.drawable.oat);
        models.add(m);

        m = new Model();
        m.setTitle("Paddy");
        m.setDescription("Paddy are good for health");
        m.setImg(R.drawable.paddy);
        models.add(m);

        m = new Model();
        m.setTitle("Cotton");
        m.setDescription("Cotton are good for health");
        m.setImg(R.drawable.cotton);
        models.add(m);

        m = new Model();
        m.setTitle("Sesame");
        m.setDescription("Sesame are good for health");
        m.setImg(R.drawable.sesame);
        models.add(m);

        m = new Model();
        m.setTitle("SoyaBeans");
        m.setDescription("SoyaBeans are good for health");
        m.setImg(R.drawable.soyabean);
        models.add(m);

        m = new Model();
        m.setTitle("Bajri");
        m.setDescription("Bajri are good for health");
        m.setImg(R.drawable.bajri);
        models.add(m);

        m = new Model();
        m.setTitle("Urad");
        m.setDescription("Urad are good for health");
        m.setImg(R.drawable.urad);
        models.add(m);

        m = new Model();
        m.setTitle("Mung");
        m.setDescription("Mung are good for health");
        m.setImg(R.drawable.moong);
        models.add(m);

        m = new Model();
        m.setTitle("Ladies Finger");
        m.setDescription("Ladies Finger are good for health");
        m.setImg(R.drawable.ladisfinger);
        models.add(m);

        return models;

    }


    private ArrayList<Model> getMyList2() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Wheat");
        m.setDescription("Wheat are good for health");
        m.setImg(R.drawable.wheat);
        models.add(m);

        m = new Model();
        m.setTitle("Mustard");
        m.setDescription("Mustard are good for health");
        m.setImg(R.drawable.mustard);
        models.add(m);

        m = new Model();
        m.setTitle("Lucerne");
        m.setDescription("Lucerne are good for health");
        m.setImg(R.drawable.lucerne);
        models.add(m);

        m = new Model();
        m.setTitle("Castor");
        m.setDescription("Castor are good for health");
        m.setImg(R.drawable.castor);
        models.add(m);

        m = new Model();
        m.setTitle("Maize");
        m.setDescription("Mustad are good for health");
        m.setImg(R.drawable.maize);
        models.add(m);

        m = new Model();
        m.setTitle("Paddy");
        m.setDescription("Paddy are good for health");
        m.setImg(R.drawable.paddy);
        models.add(m);

        m = new Model();
        m.setTitle("Cotton");
        m.setDescription("Cotton are good for health");
        m.setImg(R.drawable.cotton);
        models.add(m);

        m = new Model();
        m.setTitle("Sesame");
        m.setDescription("Sesame are good for health");
        m.setImg(R.drawable.sesame);
        models.add(m);

        m = new Model();
        m.setTitle("SoyaBeans");
        m.setDescription("SoyaBeans are good for health");
        m.setImg(R.drawable.soyabean);
        models.add(m);

        m = new Model();
        m.setTitle("Bajri");
        m.setDescription("Bajri are good for health");
        m.setImg(R.drawable.bajri);
        models.add(m);

        m = new Model();
        m.setTitle("Urad");
        m.setDescription("Urad are good for health");
        m.setImg(R.drawable.urad);
        models.add(m);

        m = new Model();
        m.setTitle("Mung");
        m.setDescription("Mung are good for health");
        m.setImg(R.drawable.moong);
        models.add(m);

        m = new Model();
        m.setTitle("Ladies Finger");
        m.setDescription("Ladies Finger are good for health");
        m.setImg(R.drawable.ladisfinger);
        models.add(m);

        return models;

    }

    private ArrayList<Model> getMyList3() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Wheat");
        m.setDescription("Wheat are good for health");
        m.setImg(R.drawable.wheat);
        models.add(m);

        m = new Model();
        m.setTitle("Mustard");
        m.setDescription("Mustard are good for health");
        m.setImg(R.drawable.mustard);
        models.add(m);

        m = new Model();
        m.setTitle("Lucerne");
        m.setDescription("Lucerne are good for health");
        m.setImg(R.drawable.lucerne);
        models.add(m);

        return models;

    }

}
