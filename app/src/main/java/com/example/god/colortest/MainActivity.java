package com.example.god.colortest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.colorutils.GodUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text;
    private int backColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.colorText1);
        backColor = GodUtils.StringTransInt("ff009507");
        text.setBackgroundColor(backColor);
        Button dark = (Button)findViewById(R.id.darkButton);
        Button light = (Button)findViewById(R.id.lightButton);
        dark.setOnClickListener(this);
        light.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.darkButton:
                text.setBackgroundColor(GodUtils.TranslateDark(backColor,30));
                break;
            case R.id.lightButton:
                text.setBackgroundColor(GodUtils.TranslateLight(backColor,30));
                break;

        }

    }
}
