package com.example.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class ResultActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        textView() = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();

        String answer = intent.getStringExtra("answer");
        textView.setText(answer);


    }

}