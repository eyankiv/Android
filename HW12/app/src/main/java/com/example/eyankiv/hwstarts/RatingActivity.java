package com.example.eyankiv.hwstarts;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RatingActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);


        Intent intent = getIntent();
        String msg = intent.getStringExtra("MESSAGE");


        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //layoutParams.addRule(RelativeLayout.BELOW, R.id.);
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.activity_rating);
        TextView textView = new TextView(this);
        textView.setText(msg);
        relativeLayout.addView(textView,layoutParams);


    }
}
