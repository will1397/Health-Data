package edu.purdue.will1397.healthdataapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class Symptoms extends AppCompatActivity {

    Button profile;
    LinearLayout head;
    LinearLayout chest;
    LinearLayout uB;
    LinearLayout lB;
    LinearLayout gT;

    CheckBox h;
    CheckBox c;
    CheckBox u;
    CheckBox l;
    CheckBox g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        head = (LinearLayout) findViewById(R.id.HeadLayout);
        chest = (LinearLayout) findViewById(R.id.ChestLayout);
        uB = (LinearLayout) findViewById(R.id.UBLayout);
        lB = (LinearLayout) findViewById(R.id.LBLayout);
        gT = (LinearLayout) findViewById(R.id.GTLayout);

        String[] headList = new String[] {};


        final Context context = this;
        profile = (Button) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Home.class);
                startActivity(intent);

            }
        });
    }
}
