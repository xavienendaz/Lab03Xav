package com.example.xavier.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE_Firstname = "com.example.myfirstapp.MESSAGE";
    public final static String EXTRA_MESSAGE_Lastname = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /** Called when the user clicks the Send button */
    public void sendRegistration(View view){
        Intent intent = new Intent(this, DisplayRegistrationActivity.class);

        EditText editText = (EditText) findViewById(R.id.firstname);
        String message = editText.getText().toString();

        EditText editTextLastname = (EditText) findViewById(R.id.lastname);
        String messageLastname = editText.getText().toString();
        /*putExtra method*/
        intent.putExtra(EXTRA_MESSAGE_Firstname, message);
      //  intent.putExtra(EXTRA_MESSAGE_Lastname, messageLastname);
        /*The startActivity() method starts an instance of the DisplayMessageActivity specified by the Intent.*/
        startActivity(intent);
    }

}
