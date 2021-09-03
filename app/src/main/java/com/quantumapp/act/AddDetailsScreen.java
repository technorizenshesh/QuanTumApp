package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.quantumapp.R;
import com.quantumapp.adapter.CountryInSpinnerAdapter;
import com.quantumapp.databinding.ActivityAddDetailsScreenBinding;

public class AddDetailsScreen extends AppCompatActivity {

    ActivityAddDetailsScreenBinding binding;
    private int flags[]= {R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo};
    private String CountryList[]= {"Text 1","Text 2","Text 3","Text 4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_add_details_screen);

        CountryInSpinnerAdapter customAdapter=new CountryInSpinnerAdapter(AddDetailsScreen.this,flags,CountryList);
        binding.spinnerCountry.setAdapter(customAdapter);
        binding.spinnerState.setAdapter(customAdapter);

        binding.imgBack.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}