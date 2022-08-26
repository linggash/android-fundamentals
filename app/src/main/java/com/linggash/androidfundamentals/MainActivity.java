package com.linggash.androidfundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private void startIntent(Class app, String msg){
        Intent intent = new Intent(this, app);

        startActivity(intent);
        Log.d(LOG_TAG, msg);
    }

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
    }

    public void helloWorld(View view) {
        startIntent(HelloWorld.class, "1. Hello World");
    }

    public void interractiveUi(View view) {
        startIntent(InterractiveUi.class, "2. Interractive UI");
    }

    public void textScrollingView(View view) {
        startIntent(TextAndScrollingView.class, "3. Text and Scrolling View");
    }
}