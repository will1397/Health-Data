package edu.purdue.will1397.healthdataapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import static edu.purdue.will1397.healthdataapp.Home.patient;

public class Symptoms extends AppCompatActivity {

    public void Symptoms_generators(ArrayList<String> sent, String[] array) {
        int n;
        for(n = 0; n < array.length; n++) {
            sent.add(array[n]);
        }
    }

    Button profile;
    LinearLayout head;
    LinearLayout chest;
    LinearLayout uB;
    LinearLayout lB;
    LinearLayout gT;
    Button results;

    CheckBox h;
    CheckBox c;
    CheckBox u;
    CheckBox l;
    CheckBox g;
    public static ArrayList<String> Symptoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        head = (LinearLayout) findViewById(R.id.HeadLayout);
        chest = (LinearLayout) findViewById(R.id.ChestLayout);
        uB = (LinearLayout) findViewById(R.id.UBLayout);
        lB = (LinearLayout) findViewById(R.id.LBLayout);
        gT = (LinearLayout) findViewById(R.id.GTLayout);

        final String[] headList = new String[] {"Headache", "Dizziness", "Nosebleeds", "Fainting", "Blurred Vision"
            , "Bleeding Gums"};
        final String[] UBList = new String[] {"Easy Bruising", "Muscle Weakness", "Muscle Spasms",
            "Prolonged Bleeding from Cuts", "Burning, Crawling, or Prickling of Arms"};
        final String[] chestList = new String[] {"Chest Pain", "Back Pain", "Coughing up Blood", "Difficulty Breathing"};
        final String[] GTList = new String[] {"Vomiting Blood", "Abdominal Distension", "Heavy Menstrual Bleeding",
            "Bloody, Black, or Tarry Stools", "Red or Pink Urine", "Abnormal Bowel or Bladder Difficulty"};
        final String[] LBList = new String[] {"Leg Weakness", "Muscle Spasms", "Easy Bruising", "Numbness",
            "Paralysis", "Prolonged Bleeding from Cuts", "Burning, Crawling, or Prickling of Legs"};

        final CheckBox[] symptomCheckBoxes = new CheckBox[28];
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

        results = (Button) findViewById(R.id.results);
        results.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Results.class);
                startActivity(intent);
            }
        });

        Button clickButton = (Button) findViewById(R.id.Submit);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                List<Boolean> list = new ArrayList<>();
                for(int n = 0; n < 28; n++) {
                    if (symptomCheckBoxes[n].isEnabled()) {
                        list.add(true);
                    } else {
                        list.add(false);
                    }
                    Symptoms = new ArrayList<>();
                    Symptoms_generators(Symptoms,headList);
                    Symptoms_generators(Symptoms,UBList);
                    Symptoms_generators(Symptoms,chestList);
                    Symptoms_generators(Symptoms,GTList);
                    Symptoms_generators(Symptoms,LBList);

                    ArrayList<String> User_Symptoms = new ArrayList<>();

                    for(n = 0; n < Symptoms.size(); n++) {
                        if(list.get(n)) {
                            User_Symptoms.add(Symptoms.get(n));
                        }
                    }
                    patient.setList_of_Symptoms(User_Symptoms);
                }
            }
        });
    }
}
