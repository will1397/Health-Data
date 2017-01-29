package edu.purdue.will1397.healthdataapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    LinearLayout linearLayoutHome;
    CheckBox c1;
    ScrollView scrollView;
    Button symptoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        scrollView = (ScrollView) findViewById(R.id.medicalHistory);
        linearLayoutHome = (LinearLayout) findViewById(R.id.linearLayoutHome);
        String checkBoxList[];
        checkBoxList = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}; //put the values for the checkboxes here

        for (int i = 0; i < checkBoxList.length; i++) { //dynamically create checkboxes
            CheckBox c1 = new CheckBox(this);
            c1.setText(checkBoxList[i]);
            linearLayoutHome.addView(c1);
        }

        final Context context = this;
        symptoms = (Button) findViewById(R.id.symptoms);
        symptoms.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Symptoms.class);
                startActivity(intent);

            }
        });
    }
}
