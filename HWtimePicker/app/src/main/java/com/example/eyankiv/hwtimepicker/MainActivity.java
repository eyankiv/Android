package com.example.eyankiv.hwtimepicker;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timePicker = (TimePicker) findViewById(R.id.timePicker);

        timePicker.setIs24HourView(true);
    }



    public void displayBtn(View view) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            int minute = timePicker.getMinute();
            Toast.makeText(this,String.valueOf(minute),Toast.LENGTH_SHORT).show();
        }else {
            timePicker.getCurrentMinute();
        }
    }
}
