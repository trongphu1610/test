package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterSong;
import com.example.myapplication.model.Songg;

import java.util.List;



public class FragmentFavorite extends Fragment {
    private List<Songg> songs;
    private AdapterSong songAdapter;

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private static  FragmentFavorite INSTANCE;

    public static  FragmentFavorite getInstance(){
        if (INSTANCE == null){
            INSTANCE = new FragmentFavorite();
        }
        return INSTANCE;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite,container,false);
        return  view;
    }

}
