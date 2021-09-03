package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;

import com.quantumapp.R;
import com.quantumapp.databinding.ActivityPaymentScreenBinding;

import java.util.Calendar;

public class PaymentScreen extends AppCompatActivity {

    ActivityPaymentScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this,R.layout.activity_payment_screen);

       binding.imgBack.setOnClickListener(v -> {
           onBackPressed();
       });


        binding.txtPayment.setOnClickListener(v -> {

            startActivity(new Intent(PaymentScreen.this,PaymentMember.class));

        });

        binding.RRTrasactiondATE.setOnClickListener(v -> {
            final Calendar c = Calendar.getInstance();
            int mYear = c.get(Calendar.YEAR);
            int mMonth = c.get(Calendar.MONTH);
            int mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(PaymentScreen.this,R.style.AppTheme_Onenew,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                            String dob = (dayOfMonth+"-"+(monthOfYear)+"-"+year);
                            binding.txtTrascaDate.setText(dob);
                        }
                    }, mYear, mMonth, mDay);
            //datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
            datePickerDialog.show();

        });
        binding.RRValidDate.setOnClickListener(v -> {

            final Calendar c = Calendar.getInstance();
            int mYear = c.get(Calendar.YEAR);
            int mMonth = c.get(Calendar.MONTH);
            int mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(PaymentScreen.this,R.style.AppTheme_Onenew,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                            String dob = (dayOfMonth+"-"+(monthOfYear)+"-"+year);
                            binding.txtValidDate.setText(dob);
                        }
                    }, mYear, mMonth, mDay);
            //datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
            datePickerDialog.show();
        });


    }
}