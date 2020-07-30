package com.med.shg_succor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.google.android.material.textfield.TextInputEditText;

public class Loginmem extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginmem);

        b1 = findViewById(R.id.btn_signup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent int1 = new Intent(Loginmem.this,Signupmem.class);
                    startActivity(int1); }
        });
    }}