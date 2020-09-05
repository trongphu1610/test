package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.activity.MainActivity;
import com.example.myapplication.adapter.AdapterSong;
import com.example.myapplication.api.SongUtil;
import com.example.myapplication.model.Songg;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentTop extends Fragment {
    private static FragmentTop INSTANCE;
    private List<Songg> songgs;
    private AdapterSong adapter;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    public static FragmentTop getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FragmentTop();
        }
        return INSTANCE;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        recyclerView = view.findViewById(R.id.rscv_top);
        progressBar = view.findViewById(R.id.progressBar);

        songgs = new ArrayList<>();
        adapter = new AdapterSong(getContext(),songgs);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        SongUtil.getSongService().getAllSong().enqueue(new ListCallback());
        return view;
    }

    private class ListCallback implements Callback<List<Songg>> {
        @Override
        public void onResponse(Call<List<Songg>> call, Response<List<Songg>> response) {
            songgs.addAll(response.body());
            adapter.notifyDataSetChanged();
            progressBar.setVisibility(View.GONE);
        }

        @Override
        public void onFailure(Call<List<Songg>> call, Throwable t) {

        }
    }
}
