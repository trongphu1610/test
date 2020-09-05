package com.example.myapplication.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterSinger extends RecyclerView.Adapter<AdapterSinger.SingHolder> {
    @NonNull
    @Override
    public AdapterSinger.SingHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSinger.SingHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class SingHolder extends RecyclerView.ViewHolder {
        public SingHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
