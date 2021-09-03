package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.quantumapp.R;
import com.quantumapp.databinding.ActivityPaymentMemberBinding;

public class PaymentMember extends AppCompatActivity {

    ActivityPaymentMemberBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_payment_member);

        binding.imgBack.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.txtPayment.setOnClickListener(v -> {

           // startActivity(new Intent(PaymentMember.this,AccountDetailspAge.class));
            startActivity(new Intent(PaymentMember.this,ProductPakageMemeber.class));

        });

        binding.txtPayment1.setOnClickListener(v -> {
        //   startActivity(new Intent(PaymentMember.this,AccountDetailspAge.class));
           startActivity(new Intent(PaymentMember.this,ProductPakageMemeber.class));
        });

        binding.RROne.setOnClickListener(v -> {

            startActivity(new Intent(PaymentMember.this,CalenderDetails.class));
        });

        binding.RRTwo.setOnClickListener(v -> {
            startActivity(new Intent(PaymentMember.this,DateDetailsActivity.class));
        });

        binding.RRThree.setOnClickListener(v -> {
            startActivity(new Intent(PaymentMember.this,DateDetailsActivityTwo.class));

        });

        binding.RRFour.setOnClickListener(v -> {
            startActivity(new Intent(PaymentMember.this,CalenderActivity.class));

        });
    }
}