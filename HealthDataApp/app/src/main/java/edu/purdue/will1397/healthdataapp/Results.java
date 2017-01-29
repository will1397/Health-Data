package edu.purdue.will1397.healthdataapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Results extends AppCompatActivity {

    Button profile;
    Button symptoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        final Context context = this;
        profile = (Button) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Home.class);
                startActivity(intent);

            }
        });

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
