package com.linggash.androidfundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
    }

    public void helloWorld(View view) {
        Intent intent = new Intent(this, HelloWorld.class);

        startActivity(intent);
        Log.d(LOG_TAG, "1. Hello World");
    }

    public void interractiveUi(View view) {
        Intent intent = new Intent(this, InterractiveUi.class);

        startActivity(intent);
        Log.d(LOG_TAG, "2. Interracttive UI");
    }

    public void textScrollingView(View view) {
    }
}