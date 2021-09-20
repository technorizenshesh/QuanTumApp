package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import com.quantumapp.Model.Calender;
import com.quantumapp.R;
import com.quantumapp.adapter.CalenderSpinnerAdapter;
import com.quantumapp.adapter.CalenderYearRecyclerViewAdapter;
import com.quantumapp.adapter.CountryInSpinnerAdapter;
import com.quantumapp.databinding.ActivityCalenderDetailsBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CalenderDetails extends AppCompatActivity {

    private int flags[]= {R.drawable.logo,R.drawable.logo,R.drawable.logo,R.drawable.logo};
    private String CountryList[]= {"2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","","2010","2009","2008","2007","2006","2005","2004","2003"
            ,"2002","2001","2000","1999","1998","1997","1996",
            "1995","1994","1993","1992","1991","1990","1989","1988","1987"};
    ActivityCalenderDetailsBinding binding;
    CalenderYearRecyclerViewAdapter mAdapter;
    private ArrayList<Calender> modelList = new ArrayList<>();

    boolean isSelected =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_calender_details);

        CalenderSpinnerAdapter customAdapter=new CalenderSpinnerAdapter(CalenderDetails.this,flags,CountryList);
        binding.spinnerCountry.setAdapter(customAdapter);

        binding.RROpen.setOnClickListener(v -> {
            if(isSelected)
            {
                binding.RRCalender.setVisibility(View.GONE);
                isSelected=false;
            }else
            {
                binding.RRCalender.setVisibility(View.VISIBLE);
                isSelected=true;
            }
        });

        binding.txtOk.setOnClickListener(v -> {

            binding.RRCalender.setVisibility(View.GONE);

        });



        setAdapter();
    }

    private void setAdapter() {

        modelList.clear();
        modelList.add(new Calender("1975"));
        modelList.add(new Calender("1976"));
        modelList.add(new Calender("1977"));
        modelList.add(new Calender("1978"));
        modelList.add(new Calender("1979"));
        modelList.add(new Calender("1980"));
        modelList.add(new Calender("1981"));
        modelList.add(new Calender("1982"));
        modelList.add(new Calender("1983"));
        modelList.add(new Calender("1984"));
        modelList.add(new Calender("1985"));
        modelList.add(new Calender("1986"));
        modelList.add(new Calender("1987"));
        modelList.add(new Calender("1988"));
        modelList.add(new Calender("1989"));
        modelList.add(new Calender("1990"));
        modelList.add(new Calender("1991"));
        modelList.add(new Calender("1992"));
        modelList.add(new Calender("1993"));
        modelList.add(new Calender("1994"));
        modelList.add(new Calender("1995"));
        modelList.add(new Calender("1996"));
        modelList.add(new Calender("1997"));
        modelList.add(new Calender("1998"));
        modelList.add(new Calender("1999"));
        modelList.add(new Calender("2000"));
        modelList.add(new Calender("2001"));
        modelList.add(new Calender("2003"));
        modelList.add(new Calender("2004"));
        modelList.add(new Calender("2005"));
        modelList.add(new Calender("2006"));
        modelList.add(new Calender("2007"));
        modelList.add(new Calender("2008"));
        modelList.add(new Calender("2009"));
        modelList.add(new Calender("2010"));
        modelList.add(new Calender("2011"));
        modelList.add(new Calender("2012"));
        modelList.add(new Calender("2013"));
        modelList.add(new Calender("2014"));
        modelList.add(new Calender("2015"));
        modelList.add(new Calender("2016"));
        modelList.add(new Calender("2017"));
        modelList.add(new Calender("2018"));
        modelList.add(new Calender("2019"));
        modelList.add(new Calender("2020"));
        modelList.add(new Calender("2021"));

        mAdapter = new CalenderYearRecyclerViewAdapter(CalenderDetails.this,modelList);
        binding.recyclerCalender.setHasFixedSize(true);
        // use a linear layout manager
        //  binding.recyclerSearch.setLayoutManager(new GridLayoutManager(this, 2));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(CalenderDetails.this);
        binding.recyclerCalender.setLayoutManager(linearLayoutManager);
        binding.recyclerCalender.setAdapter(mAdapter);

        mAdapter.SetOnItemClickListener(new CalenderYearRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, Calender model) {

                 binding.txtDate.setText(model.getName());
                 binding.RRCalender.setVisibility(View.GONE);
            }
        });
    }


}