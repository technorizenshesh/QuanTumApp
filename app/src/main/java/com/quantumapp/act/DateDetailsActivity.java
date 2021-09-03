package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.quantumapp.R;
import com.quantumapp.databinding.ActivityDateDetailsBinding;

public class DateDetailsActivity extends AppCompatActivity {

    ActivityDateDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_date_details);
    }
}