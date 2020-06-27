package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name =findViewById(R.id.1);
        Button enter =findViewById(R.id.b1);
        Button enter =findViewById(R.id.b2);
        enter.setOnClickListener((view) {
    }
}