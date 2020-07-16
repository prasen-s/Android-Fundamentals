package com.example.challengeone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            int temp = 1 / 0;
        } catch (Exception e) {
            Log.e("MainActivity", "Division by zero");
            Log.e("MainActivity", e.getMessage());
        }
    }
}