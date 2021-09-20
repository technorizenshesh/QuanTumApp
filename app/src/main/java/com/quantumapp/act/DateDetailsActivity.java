package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.quantumapp.R;
import com.quantumapp.databinding.ActivityDateDetailsBinding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDetailsActivity extends AppCompatActivity {

    ActivityDateDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_date_details);

        String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());

        binding.txtDate.setText(date+"");

    }
}