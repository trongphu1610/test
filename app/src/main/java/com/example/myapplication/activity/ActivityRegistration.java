package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class ActivityRegistration extends AppCompatActivity {
    private EditText edtUsername, edtPassword,edtPasswordAgain;
    private Button btnRegistration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        edtPasswordAgain = findViewById(R.id.edt_password_again);
        btnRegistration = findViewById(R.id.btn_registration);
        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityRegistration.this, ActivityLogin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}