package com.linggash.androidfundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        String message = intent.getStringExtra(ActivitiesAndIntents.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);

        textView.setText(message);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}