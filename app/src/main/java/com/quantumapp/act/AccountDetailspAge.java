package com.quantumapp.act;


import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.quantumapp.R;
import com.quantumapp.adapter.GenderSpinnerAdapter;
import com.quantumapp.adapter.RankingSpinnerAdapter;
import com.quantumapp.databinding.ActivityAccountDetailspAgeBinding;

import java.util.Calendar;

public class AccountDetailspAge extends AppCompatActivity {

    private int flags[]= {R.drawable.logo,R.drawable.logo,R.drawable.logo};
    private String CountryList[]= {"Select Gender","Male","Female"};

    private int flag[]= {R.drawable.logo,R.drawable.logo,R.drawable.logo};
    private String RankigList[]= {"Text one","Text two","Text three"};

    ActivityAccountDetailspAgeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_account_detailsp_age);


        GenderSpinnerAdapter customAdapter=new GenderSpinnerAdapter(AccountDetailspAge.this,flags,CountryList);
        binding.spinnerGender.setAdapter(customAdapter);

        RankingSpinnerAdapter rankingAdapter=new RankingSpinnerAdapter(AccountDetailspAge.this,flag,RankigList);
        binding.spinnerRanking.setAdapter(rankingAdapter);

        binding.imgBack.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.txtSubmit.setOnClickListener(v -> {
            startActivity(new Intent(AccountDetailspAge.this,ChangePassword.class));
        });

        binding.RRTime.setOnClickListener(v -> {

            Calendar mcurrentTime = Calendar.getInstance();
            int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
            int minute = mcurrentTime.get(Calendar.MINUTE);
            TimePickerDialog mTimePicker;
            mTimePicker = new TimePickerDialog(AccountDetailspAge.this,R.style.AppTheme_Onenew, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                    binding.eReminderTime.setText( selectedHour + ":" + selectedMinute);
                }
            }, hour, minute, false);//Yes 24 hour time
            mTimePicker.setTitle("Select Time");
            mTimePicker.show();

        });
        binding.RRDate.setOnClickListener(v -> {

            final Calendar c = Calendar.getInstance();
            int mYear = c.get(Calendar.YEAR);
            int mMonth = c.get(Calendar.MONTH);
            int mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(AccountDetailspAge.this,R.style.AppTheme_Onenew,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                            String dob = (dayOfMonth+"-"+(monthOfYear)+"-"+year);
                            binding.eRemindeDate.setText(dob);
                        }
                    }, mYear, mMonth, mDay);
            //datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
            datePickerDialog.show();
        });
    }
}