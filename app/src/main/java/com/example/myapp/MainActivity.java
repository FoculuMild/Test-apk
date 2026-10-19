package com.example.myapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView textView = new TextView(this);
        textView.setText("Привет! Это мое первое APK!");
        textView.setTextSize(30);
        textView.setGravity(android.view.Gravity.CENTER);
        
        setContentView(textView);
    }
}
