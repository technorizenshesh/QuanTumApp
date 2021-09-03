package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.quantumapp.R;
import com.quantumapp.adapter.CalenderSpinnerAdapter;
import com.quantumapp.adapter.CountryInSpinnerAdapter;
import com.quantumapp.databinding.ActivityCalenderDetailsBinding;

public class CalenderDetails extends AppCompatActivity {

    private int flags[]= {R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo};
    private String CountryList[]= {"2021","2020","2019","2018"};
    ActivityCalenderDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_calender_details);

        CalenderSpinnerAdapter customAdapter=new CalenderSpinnerAdapter(CalenderDetails.this,flags,CountryList);
        binding.spinnerCountry.setAdapter(customAdapter);

        binding.txtPayment.setOnClickListener(v -> {

            startActivity(new Intent(CalenderDetails.this,DateDetailsActivity.class));

        });
    }

}