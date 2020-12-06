package com.example.quizca2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void startquiz(View view){
        Intent i = new Intent(this, quiz.class);
        startActivity(i);
    }

    public void onLogout(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}