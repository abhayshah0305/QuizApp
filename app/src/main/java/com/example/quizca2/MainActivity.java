package com.example.quizca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getstarted(View view) {
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }

    public void about(View view) {
        Intent i = new Intent(this, about.class);
        startActivity(i);
    }
}