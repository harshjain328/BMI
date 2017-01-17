package com.bmi;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class bmigraph extends AppCompatActivity {

    RadioGroup rgrp;
    LinearLayout h,w;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmigraph);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("BMI");
        setSupportActionBar(toolbar);
        rgrp=(RadioGroup)findViewById(R.id.rgrp);
        h=(LinearLayout)findViewById(R.id.lh);
        w=(LinearLayout)findViewById(R.id.lw);
        b=(Button)findViewById(R.id.button3);
        rgrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.radioButton1){
                    h.setVisibility(View.VISIBLE);
                    w.setVisibility(View.VISIBLE);
                    b.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}
