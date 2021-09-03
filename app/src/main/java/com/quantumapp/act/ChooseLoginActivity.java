package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.quantumapp.R;
import com.quantumapp.databinding.ActivityChooseLoginBinding;

public class ChooseLoginActivity extends AppCompatActivity {

    ActivityChooseLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this,R.layout.activity_choose_login);


       binding.txtLogin.setOnClickListener(v -> {

           startActivity(new Intent(ChooseLoginActivity.this,LoginActivity.class));
       });

       binding.txtRegister.setOnClickListener(v -> {

           startActivity(new Intent(ChooseLoginActivity.this,CreateProfile.class));
       });



    }
}