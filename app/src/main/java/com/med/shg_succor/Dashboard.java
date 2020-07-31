package com.med.shg_succor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.med.shg_succor.R.*;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    private CardView c1,c2,c3,c4,c5,c6;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_dashboard);

        c1 =(CardView) findViewById(id.btn1);
        c2 = (CardView) findViewById(id.btn2);
        c3 = (CardView) findViewById(id.btn3);
        c4 = (CardView) findViewById(id.btn4);
        c5 = (CardView) findViewById(id.btn5);
        c6 = (CardView) findViewById(id.btn6);


        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this,Edit_profile.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch ( v.getId()){
            case  id.btn1:
                i=new Intent(this,Edit_profile.class);
                startActivity(i);
                break;

            case id.btn2:
                i=new Intent(this,Members_List.class);
                startActivity(i);
                break;

            case id.btn3:
                i=new Intent(this,Loan.class);
                startActivity(i);
                break;

            case id.btn4:
                i=new Intent(this,Transaction.class);
                startActivity(i);
                break;

            case id.btn5:
                i=new Intent(this,Report.class);
                startActivity(i);
                break;

            case id.btn6:
                i=new Intent(this,Settings.class);
                startActivity(i);
                break;
        }

    }
}