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

        String[] headList = new String[] {"Headache", "Dizziness", "Nosebleeds", "Fainting", "Blurred Vision"
            , "Bleeding Gums"};
        String[] UBList = new String[] {"Easy Bruising", "Muscle Weakness", "Muscle Spasms",
            "Prolonged Bleeding from Cuts", "Burning, Crawling, or Prickling of Arms"};
        String[] chestList = new String[] {"Chest Pain", "Back Pain", "Coughing up Blood", "Difficulty Breathing"};
        String[] GTList = new String[] {"Vomiting Blood", "Abdominal Distension", "Heavy Menstrual Bleeding",
            "Bloody, Black, or Tarry Stools", "Red or Pink Urine", "Abnormal Bowel or Bladder Difficulty"};
        String[] LBList = new String[] {"Leg Weakness", "Muscle Spasms", "Easy Bruising", "Numbness",
            "Paralysis", "Prolonged Bleeding from Cuts", "Burning, Crawling, or Prickling of Legs"};

        CheckBox[] symptomCheckBoxes = new CheckBox[28];
        int j = 0;

        for (int i = 0; i < headList.length; i++) {
            CheckBox h = new CheckBox(this);
            h.setText(headList[i]);
            symptomCheckBoxes[j] = h;
            j++;
            head.addView(h);
        }

        for (int i = 0; i < UBList.length; i++) {
            CheckBox u = new CheckBox(this);
            u.setText(UBList[i]);
            symptomCheckBoxes[j] = u;
            j++;
            uB.addView(u);
        }

        for (int i = 0; i < chestList.length; i++) {
            CheckBox c = new CheckBox(this);
            c.setText(chestList[i]);
            symptomCheckBoxes[j] = c;
            j++;
            chest.addView(c);
        }

        for (int i = 0; i < GTList.length; i++) {
            CheckBox g = new CheckBox(this);
            g.setText(GTList[i]);
            symptomCheckBoxes[j] = g;
            j++;
            gT.addView(g);
        }

        for (int i = 0; i < LBList.length; i++) {
            CheckBox l = new CheckBox(this);
            l.setText(LBList[i]);
            symptomCheckBoxes[j] = l;
            j++;
            lB.addView(l);
        }

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
