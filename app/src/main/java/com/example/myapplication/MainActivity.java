package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int c=6/7;
        Log.i("Tag", "onCreate: c"+c);

        int d=6%7;
        Log.i("Tag", "onCreate: d"+d);
    }
}
