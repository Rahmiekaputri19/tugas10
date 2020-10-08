package com.example.tugas10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHelper dbDatabaseHelper = new_DatabaseHelper(this);
        DatabaseHelper.getWritableDatabase();

    }
}
