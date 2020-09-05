package com.example.myapplication.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.myapplication.R;
import com.example.myapplication.adapter.AdapterSong;
import com.example.myapplication.api.SongUtil;
import com.example.myapplication.fragment.FragmentAlbum;
import com.example.myapplication.fragment.FragmentFavorite;
import com.example.myapplication.fragment.FragmentPersonal;
import com.example.myapplication.fragment.FragmentSinger;
import com.example.myapplication.fragment.FragmentTop;

import com.example.myapplication.model.Songg;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().add(R.id.fl_container, new FragmentAlbum()).commit();

        }


        navigationView = findViewById(R.id.nav_bottom);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.item_album:
                        selectedFragment = FragmentAlbum.getInstance();
                        break;
                    case R.id.item_rank:
                        selectedFragment = FragmentTop.getInstance();
                        break;
                    case R.id.item_faverite:
                        selectedFragment = FragmentFavorite.getInstance();
                        break;
                    case R.id.item_singer:
                        selectedFragment = FragmentSinger.getInstance();
                        break;
                    case R.id.item_personal:
                        selectedFragment = FragmentPersonal.getInstance();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, selectedFragment).commit();
                return true;
            }
        });
    }

    public void Changer_PassWord(View view) {
        Context context;
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_change_password);
        dialog.show();
        Button btnChanger = dialog.findViewById(R.id.btn_changer);
        btnChanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityLogin.class);
                startActivity(intent);
                finish();
            }
        });
        Button btnCancel = dialog.findViewById(R.id.btn_cancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
    }

    public void Log_out(View view) {
        Context context;
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_log_out);
        dialog.show();
        Button btnOkButton = dialog.findViewById(R.id.btn_ok);
        btnOkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityLogin.class);
                startActivity(intent);
                finish();
            }
        });
        Button btnCancel = dialog.findViewById(R.id.btn_cancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
    }


    public void Information(View view) {
        Context context;
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.item_information);
        dialog.show();

    }
}