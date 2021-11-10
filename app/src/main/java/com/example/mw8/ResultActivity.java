package com.example.mw8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tv1 = findViewById(R.id.textView4);
        Intent intent = this.getIntent();
        String bmi = intent.getStringExtra("bmi");
        String w = intent.getStringExtra("w");
        tv1.setText("你的BMI值"+bmi+'\n'+"結果為"+w);
    }
}