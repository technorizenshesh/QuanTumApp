package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.quantumapp.R;
import com.quantumapp.databinding.ActivityLoginBinding;

import static android.graphics.Color.*;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_login);

        binding.imgBack.setOnClickListener(v -> {

            onBackPressed();

        });

        binding.txtLogin.setOnClickListener(v -> {
           // startActivity(new Intent(LoginActivity.this,ProductPakageMemeber.class));
            startActivity(new Intent(LoginActivity.this,PaymentMember.class));
        });

        binding.txtForgot.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this,ForgotActivity.class));
        });
    }
}