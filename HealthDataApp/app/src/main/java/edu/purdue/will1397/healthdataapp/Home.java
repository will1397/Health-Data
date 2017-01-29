package edu.purdue.will1397.healthdataapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

import static edu.purdue.will1397.healthdataapp.DrugUser.Contraindications;
import static edu.purdue.will1397.healthdataapp.DrugUser.Medical_problems;
import static java.lang.Integer.parseInt;

public class Home extends AppCompatActivity {

    LinearLayout linearLayoutHome;
    CheckBox c1;
    ScrollView scrollView;
    Button symptoms;
    public static boolean goTodoctor = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        scrollView = (ScrollView) findViewById(R.id.medicalHistory);
        linearLayoutHome = (LinearLayout) findViewById(R.id.linearLayoutHome);
        String checkBoxList[];
        checkBoxList = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}; //put the values for the checkboxes here
        final CheckBox[] medHist = new CheckBox[10];

        for (int i = 0; i < checkBoxList.length; i++) { //dynamically create checkboxes
            CheckBox c1 = new CheckBox(this);
            c1.setText(checkBoxList[i]);
            medHist[i] = c1;
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

        Button clickButton = (Button) findViewById(R.id.button);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText text = (EditText)findViewById(R.id.name);
                String name = text.getText().toString();

                text = (EditText)findViewById(R.id.dob);
                String dob = text.getText().toString();

                text = (EditText) findViewById(R.id.weight);
                String weight = text.getText().toString();
                int weight_num = parseInt(dob);

                int boolean_len = Medical_problems.length;

                List<Boolean> list  = new ArrayList<>();
                int n;
                for(n = 0; n < boolean_len; n++) {
                    if(medHist[n].isEnabled()) {
                        list.add(true);
                    }
                }
                while(n < boolean_len + Contraindications.length) {
                    if(medHist[n].isEnabled()) {
                        goTodoctor = true;
                    }
                    n++;
                }

                DrugUser patient = new DrugUser(name,weight_num,list,dob);
            }
        });
    }


}
