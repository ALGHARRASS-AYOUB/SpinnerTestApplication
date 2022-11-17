package com.example.spinnertestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Spinner spinner=findViewById(R.id.spinner_guns);
//        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
//                R.array.guns_list, R.layout.spinner_layout);
//        adapter.setDropDownViewResource(R.layout.spinner_layout);
//        spinner.setAdapter(adapter);
    }
}