package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.Ultis;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class ActivityLogin extends AppCompatActivity {
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^"
//                    + "(?=.*[0-9])"                             // minium onen umber
//                    + "(?=.*[a-z])"                             // ninium one lower case character
//                    + "(?=.*[A-Z])"                             //minium one UPPER case character
                    + "(?=.*[a-zA-Z])"                           //any character
                    + "(?=.*[@#&*_])"                         // minium one special character
                    + "(?=\\S+$)"                              // no white spaces
                    + ".{10,}"                                    // minium length 6 characters
                    + "$");
    private EditText edtUsername, edtPassword, edtEmail;
    private Button btnLogin, btnRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        edtEmail = findViewById(R.id.edt_email);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                if (edtPassword.getText().toString().equals("admin") &&
                        edtPassword.getText().toString().equals("admin")) {
                    System.out.println("Entering");
                    intent = new Intent(view.getContext(), MainActivity.class);
                } else {
                    Toast.makeText(ActivityLogin.this, "Đăng nhập thất bại , Đăng nhập lại", Toast.LENGTH_SHORT).show();
                    intent = new Intent(ActivityLogin.this, ActivityLogin.class);
                }

                ActivityLogin.super.startActivityForResult(intent, 2);

                finish();
            }
        });
        btnRegistration = findViewById(R.id.btn_registration);
        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLogin.this, ActivityRegistration.class);
                startActivity(intent);
                finish();
            }
        });
    }


    private boolean validatePassword() {
        String password = edtPassword.getEditableText().getFilters().toString().trim();
        if (password.isEmpty()) {
            edtPassword.setError("Field cant be empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(password).matches()) {
            edtPassword.setError("Password is to weak");
            return false;
        } else {
            edtPassword.setError(null);
            return true;
        }
    }

    private boolean validateEmail() {
        String email = edtEmail.getEditableText().getFilters().toString().trim();
        if (email.isEmpty()) {
            edtEmail.setError("Field cant be empty.");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edtEmail.setError("Invalid email.enter valid email address.");
            return false;
        } else {
            edtEmail.setError(null);
            return true;
        }
    }

    //
    private boolean validateUsername() {
        String userName = edtUsername.getEditableText().getFilters().toString().trim();
        if (userName.isEmpty()) {
            edtUsername.setError("Field cant be empty.");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(userName).matches()) {
            edtUsername.setError("username to long");
            return false;
        } else {
            edtUsername.setError(null);
            return true;
        }
    }

    private void submitData(View view) {
        if (!validateUsername() | !validatePassword() | !validateEmail()) {
            return;
        }
        String data = "Password:" + edtPassword.getEditableText().getFilters().toString();
        data += "\n";
        data += "Username:" + edtUsername.getEditableText().getFilters().toString();
        data += "\n";
        data += "Email :" + edtEmail.getEditableText().getFilters().toString();
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

}
