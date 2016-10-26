package com.example.eyankiv.mytimepicker;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by eyankiv on 14-Oct-16.
 */

public class MyTimePicker extends LinearLayout {

    private int hour;
    private int minute;


    public MyTimePicker(Context context) {
        super(context);
        super.setOrientation(VERTICAL);

        //initialize layout

        LinearLayout rowTop = new LinearLayout(context);
        rowTop.setOrientation(HORIZONTAL);
        LinearLayout rowNumbers = new LinearLayout(context);
        rowNumbers.setOrientation(HORIZONTAL);
        LinearLayout rowBottom = new LinearLayout(context);
        rowBottom.setOrientation(HORIZONTAL);
        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        this.addView(rowTop,layoutParams);
        this.addView(rowNumbers,layoutParams);
        this.addView(rowBottom, layoutParams);

        //create the time view:
        //Hours text view
        final TextView hourDisp = new TextView(context);
        hourDisp.setTextSize(35);
        hourDisp.setText("    "+hour);
        rowNumbers.addView(hourDisp,layoutParams);
        //Minutes text view
        final TextView minDisp = new TextView(context);
        minDisp.setTextSize(35);
        minDisp.setText("    " + minute);
        rowNumbers.addView(minDisp,layoutParams);
        //create the top buttons
        Button plusHourBtn = new Button(context);
        plusHourBtn.setText("+ Hour");
        plusHourBtn.setTag("plusHrBtn");
        rowTop.addView(plusHourBtn,layoutParams);
        Button minusHourBtn = new Button(context);
        minusHourBtn.setText("- Hour");
        minusHourBtn.setTag("minusHrBtn");
        rowBottom.addView(minusHourBtn,layoutParams);
        //Min button
        Button minusMinBtn = new Button(context);
        minusMinBtn.setText("- Min");
        minusMinBtn.setTag("minusMinBtn");

        rowBottom.addView(minusMinBtn,layoutParams);
        Button plusMinBtn = new Button(context);
        plusMinBtn.setText("+ Min");
        plusMinBtn.setTag("plusMinBtn");
        rowTop.addView(plusMinBtn,layoutParams);
        //setting on click listeners
        plusHourBtn.setOnClickListener(timeListener);
        minusHourBtn.setOnClickListener(timeListener);
        plusMinBtn.setOnClickListener(timeListener);
        minusMinBtn.setOnClickListener(timeListener);


    }

    private OnClickListener timeListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            int tag = Integer.valueOf((String) v.getTag());
            Switch()

        }
    };

    @Override
    public void setOrientation(int orientation) {

    }
}
