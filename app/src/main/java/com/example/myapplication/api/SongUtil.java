package com.example.myapplication.api;

import com.example.myapplication.api.SongClient;
import com.example.myapplication.api.SongService;

public class SongUtil {
    private static final String BASE_URL = "https://songserver.herokuapp.com/";

    public static SongService getSongService() {
        return SongClient.getSongClient(BASE_URL).create(SongService.class);
    }
}
