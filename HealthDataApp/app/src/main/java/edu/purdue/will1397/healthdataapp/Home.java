package edu.purdue.will1397.healthdataapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    LinearLayout linearLayoutHome;
    CheckBox c1;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        scrollView = (ScrollView) findViewById(R.id.medicalHistory);
        linearLayoutHome = (LinearLayout) findViewById(R.id.linearLayoutHome);
        String checkBoxList[];
        checkBoxList = new String[] {"a", "b", "c"}; //put the values for the checkboxes here

        for(int i = 0; i < checkBoxList.length; i++) { //dynamically create checkboxes
            CheckBox c1 = new CheckBox(this);
            c1.setText(checkBoxList[i]);
            linearLayoutHome.addView(c1);
        }
    }
}
