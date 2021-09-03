package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.quantumapp.R;
import com.quantumapp.databinding.ActivityCalenderBinding;
import com.quantumapp.databinding.ActivityCalenderDetailsBinding;

public class CalenderActivity extends AppCompatActivity {

    ActivityCalenderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_calender);

    }
}