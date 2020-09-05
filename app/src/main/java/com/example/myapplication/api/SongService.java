package com.example.myapplication.api;

import com.example.myapplication.model.Songg;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SongService {
    @GET("api/searchSong")
    Call<List<Songg>> getAllSong();
}
