package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.quantumapp.R;
import com.quantumapp.databinding.ActivityCreateProfileBinding;

public class CreateProfile extends AppCompatActivity {

    ActivityCreateProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_create_profile);

        binding.imgBack.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.txtSubmit.setOnClickListener(v -> {

            startActivity(new Intent(CreateProfile.this,AddDetailsScreen.class));

        });

        binding.txtlogin.setOnClickListener(v -> {

            startActivity(new Intent(CreateProfile.this,LoginActivity.class));

        });

    }
}