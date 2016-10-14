package com.example.xavier.lab03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Xavier on 07.10.2016.
 */

public class DisplayRegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_registration);

         /* intent that started the activity. Every Activity is invoked by an Intent*/
        Intent intent = getIntent();
       /*getStringExtra() retrieves the data from the first activity*/
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_Firstname);
        TextView textViewFirstname = new TextView(this);
        textViewFirstname.setTextSize(40);
        textViewFirstname.setText(message);

        String messageLastname = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_Lastname);
        TextView textViewLastname = new TextView(this);
        textViewFirstname.setTextSize(40);
        textViewFirstname.setText(messageLastname);


        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_registration);
        layout.addView(textViewFirstname);
        layout.addView(textViewLastname);


    }
}
