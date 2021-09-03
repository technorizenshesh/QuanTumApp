package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.quantumapp.R;
import com.quantumapp.databinding.ActivityChangePasswordBinding;

public class ChangePassword extends AppCompatActivity {

    ActivityChangePasswordBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_change_password);

        binding.imgBack.setOnClickListener(v -> {

            onBackPressed();
        });
    }
}