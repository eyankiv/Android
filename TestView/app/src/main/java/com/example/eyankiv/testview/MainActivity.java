package com.example.eyankiv.testview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import static android.widget.LinearLayout.HORIZONTAL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout rowTop = new LinearLayout(this);
        rowTop.findViewById(R.id.activity_main);
        rowTop.setOrientation(HORIZONTAL);
        LinearLayout rowNumbers = new LinearLayout(context);
        rowNumbers.setOrientation(HORIZONTAL);
        LinearLayout rowBottom = new LinearLayout(context);
        rowBottom.setOrientation(HORIZONTAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        this.addView(rowTop,layoutParams);
        this.addView(rowNumbers,layoutParams);
        this.addView(rowBottom, layoutParams);
    }

}
