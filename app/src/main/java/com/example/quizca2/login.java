package com.example.quizca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class login extends AppCompatActivity {
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

    }

    public void login(View view) {
        if (email.getText().toString().equals("abhay@gmail.com") && password.getText().toString().equals("password1234")) {
            Intent i = new Intent(this, home.class);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(),"Incorrect Credentials", Toast.LENGTH_LONG).show();

        }
    }
}
