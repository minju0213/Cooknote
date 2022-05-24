package com.example.cooknote;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;


public class Date_go extends AppCompatActivity {

    private MaterialCalendarView calendarView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_go);

        calendarView = findViewById(R.id.calendarview);

        calendarView.setSelectionMode(MaterialCalendarView.SELECTION_MODE_RANGE);


    }
}

