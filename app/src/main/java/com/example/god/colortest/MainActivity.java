package com.example.god.colortest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.colorutils.GodUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text1 = (TextView)findViewById(R.id.colorText1);
        TextView text2 = (TextView)findViewById(R.id.colorText2);
        TextView text3 = (TextView)findViewById(R.id.colorText3);
        String color = "55955522";

        int i = GodUtils.StringTransInt(color);
        int i1 = GodUtils.LightAlpha(i,50);
        text1.setBackgroundColor(i);
        text2.setBackgroundColor(i1);





    }
}
