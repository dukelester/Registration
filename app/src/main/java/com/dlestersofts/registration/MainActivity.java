package com.dlestersofts.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onRegisterBtnClick (View view) {
        //the text view by Id
        TextView textFirstname = findViewById(R.id.textFirstname);
        TextView textLastName = findViewById(R.id.textLastName);
        TextView textEmail = findViewById(R.id.textEmail);

//        Get the edit text
        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editLastName = findViewById(R.id.editTextLastName);
        EditText editTextTextEmail = findViewById(R.id.editTextTextEmail);

        //set or change the text views
        textFirstname.setText("First Name is " + editTextFirstName.getText().toString());
        textLastName.setText("Last Name " + editLastName.getText().toString());
        textEmail.setText("Email is " + editTextTextEmail.getText().toString());


    }
}