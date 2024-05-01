package com.example.greengrowth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class spinneradapter {

    public static class Adapter extends RecyclerView.Adapter<Adapter.myviewholder> {


        Context mcontext;
        List<spinneritem> mdata;


        public Adapter(Context mcontext, List<spinneritem> mdata) {
            this.mcontext = mcontext;
            this.mdata = mdata;
        }

        @NonNull
        @Override
        public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(mcontext);
            View v = inflater.inflate(R.layout.spinnercard, parent, false);
            return new myviewholder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull myviewholder holder, int position) {

            holder.lab_name.setText(mdata.get(position).getLab_name());
            holder.lab_type.setText(mdata.get(position).getLab_type());
            holder.govt_funding.setText(mdata.get(position).getGov_funding());
            holder.mobile.setText(mdata.get(position).getMobile());

        }

        @Override
        public int getItemCount() {
            return mdata.size() ;
        }

        public class myviewholder extends RecyclerView.ViewHolder {

            TextView lab_name,lab_type,govt_funding,mobile;


            public myviewholder(View itemview) {
                super(itemview);
                lab_name = itemview.findViewById(R.id.lab_name);
                lab_type = itemview.findViewById(R.id.lab_type);
                govt_funding = itemview.findViewById(R.id.govt_funding);
                mobile = itemview.findViewById(R.id.mobile);
            }
        }

    }

}
