package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterAlbum;
import com.example.myapplication.model.Album;

import java.util.ArrayList;
import java.util.List;

public class FragmentAlbum extends Fragment {
    private List<Album> albums;
    private RecyclerView rscv;
    private AdapterAlbum adapterAlbum;
    private static FragmentAlbum INSTANCE;

    public static FragmentAlbum getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FragmentAlbum();
        }
        return INSTANCE;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_album, container, false);
        rscv = view.findViewById(R.id.rscv_album);
        albums = new ArrayList<>();
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc1"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc3"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc4"));
        albums.add(new Album("https://zmp3-photo-fbcrawler.zadn.vn/avatars/f/7/f7207d810f150acf28322ac2368d75eb_1332587938.jpg", "abc5"));


        adapterAlbum = new AdapterAlbum(getContext(),albums);
        rscv.setAdapter(adapterAlbum);
        rscv.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}
