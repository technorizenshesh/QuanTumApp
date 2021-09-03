package com.quantumapp.act;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.quantumapp.R;
import com.quantumapp.databinding.ActivityProductPakageMemeberBinding;

public class ProductPakageMemeber extends AppCompatActivity {

    ActivityProductPakageMemeberBinding binding;

    boolean iSPakageOne=true;
    boolean iSPakagePart=true;

    boolean iSPakageTwo=true;
    boolean iSPakagePartTwo =true;

    boolean iSPakagePartThee =true;
    boolean iSPakagePartTheePart =true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_product_pakage_memeber);

        binding.imgBack.setOnClickListener(v -> {
            onBackPressed();
        });

        binding.txtPayment.setOnClickListener(v -> {
            //startActivity(new Intent(ProductPakageMemeber.this,AccountDetailspAge.class));
            startActivity(new Intent(ProductPakageMemeber.this,MemberDetails.class));
        });

        binding.RRpakageOne.setOnClickListener(v -> {

            if(iSPakageOne)
            {
                binding.pakageOne.setImageResource(R.drawable.arw_top);
                binding.RRpakaegePart.setVisibility(View.VISIBLE);
                iSPakageOne =false;
            }else
            {
                binding.pakageOne.setImageResource(R.drawable.arw);
                binding.RRpakaegePart.setVisibility(View.GONE);
                binding.RRpakaegePartOne.setVisibility(View.GONE);

                iSPakageOne =true;
            }

        });

        binding.RRpakaegePart.setOnClickListener(v -> {

            if(iSPakagePart)
            {
                binding.pakageOnePart.setImageResource(R.drawable.arw_top);
                binding.RRpakaegePartOne.setVisibility(View.VISIBLE);
                iSPakagePart=false;

            }else
            {
                binding.pakageOnePart.setImageResource(R.drawable.arw);
                binding.RRpakaegePartOne.setVisibility(View.GONE);
                iSPakagePart=true;
            }
        });

        binding.RRpakageTwo.setOnClickListener(v -> {

            if(iSPakageTwo)
            {
                binding.imgPakageTwo.setImageResource(R.drawable.arw_top);
                binding.RRpakaegeTwoPart.setVisibility(View.VISIBLE);
                iSPakageTwo =false;
            }else
            {
                binding.imgPakageTwo.setImageResource(R.drawable.arw);
                binding.RRpakaegeTwoPart.setVisibility(View.GONE);
                binding.RRpakaegePartTwo.setVisibility(View.GONE);
                iSPakageTwo =true;
            }

        });

        binding.RRpakaegeTwoPart.setOnClickListener(v -> {

            if(iSPakagePartTwo)
            {
                binding.imgPakageTwoPart.setImageResource(R.drawable.arw_top);
                binding.RRpakaegePartTwo.setVisibility(View.VISIBLE);
                iSPakagePartTwo=false;

            }else
            {
                binding.imgPakageTwoPart.setImageResource(R.drawable.arw);
                binding.RRpakaegePartTwo.setVisibility(View.GONE);
                iSPakagePartTwo=true;
            }
        });

        binding.RRpakageThree.setOnClickListener(v -> {

            if(iSPakagePartThee)
            {
                binding.imgPakageThree.setImageResource(R.drawable.arw_top);
                binding.RRPakageThreePar.setVisibility(View.VISIBLE);
                iSPakagePartThee=false;

            }else
            {
                binding.imgPakageThree.setImageResource(R.drawable.arw);
                binding.RRPakageThreePar.setVisibility(View.GONE);
                binding.RRPakageThreeParthree.setVisibility(View.GONE);
                iSPakagePartThee=true;
            }
        });

        binding.RRPakageThreePar.setOnClickListener(v -> {

            if(iSPakagePartTheePart)
            {
                binding.imgPakageThreePart.setImageResource(R.drawable.arw_top);
                binding.RRPakageThreeParthree.setVisibility(View.VISIBLE);
                iSPakagePartTheePart=false;

            }else
            {
                binding.imgPakageThreePart.setImageResource(R.drawable.arw);
                binding.RRPakageThreeParthree.setVisibility(View.GONE);
                iSPakagePartTheePart=true;
            }
        });
    }
}