package com.example.greengrowth.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.greengrowth.R;
import com.example.greengrowth.kharif_crop;
import com.example.greengrowth.rabi_crop;
import com.example.greengrowth.summer_crop;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        CardView rabi_cardV = root.findViewById(R.id.rabi_card);
        CardView kharif_cardV = root.findViewById(R.id.kharif_card);
        CardView summer_cardV = root.findViewById(R.id.summer_card);

        rabi_cardV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), rabi_crop.class));
            }
        });

        kharif_cardV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), kharif_crop.class));
            }
        });

        summer_cardV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), summer_crop.class));
            }
        });

        return root;
    }
}
