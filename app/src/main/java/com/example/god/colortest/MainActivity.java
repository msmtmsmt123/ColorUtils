package com.example.god.colortest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.colorutils.GodUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout colorShow;
    private int backColor;
    private EditText colorText;
    private boolean changed = false;
    private Button sureButton;
    private int saveColor;
    private Toolbar toolbar;
    private Button add;
    private Button del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.tooblar);
        toolbar.setTitleTextColor(GodUtils.StringTransInt("ffffffff"));
        setSupportActionBar(toolbar);
        sureButton = (Button) findViewById(R.id.sureColor);
        add = (Button) findViewById(R.id.add);
        del = (Button) findViewById(R.id.del);
        colorText = (EditText) findViewById(R.id.colorText);
        colorShow = (RelativeLayout) findViewById(R.id.rootLayout);


        colorText.setText("ff009587");
        backColor = GodUtils.StringTransInt(colorText.getText().toString());
        toolbar.setBackgroundColor(GodUtils.TranslateDark(backColor,30));
        colorShow.setBackgroundColor(backColor);

        sureButton.setOnClickListener(this);
        add.setOnClickListener(this);
        del.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sureColor:
                if (changed) {
                    setColor(saveColor);
                    changed = false;
                    sureButton.setText("确认");
                } else {
                    String color = colorText.getText().toString();
                    if (GodUtils.judgeColorString(color))
                        setColor(GodUtils.StringTransInt(color));
                     else
                         Toast.makeText(this, "请输入正确的值", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.add:
                changeState();
                setColor(GodUtils.TranslateDark(backColor, 5));
                break;
            case R.id.del:
                changeState();
                setColor(GodUtils.TranslateLight(backColor, 5));
                break;
        }
    }

    private void changeState() {
        if (!changed) {
            sureButton.setText("复位");
            saveColor = backColor;
            changed = true;
        }
    }

    private void setColor(int color){
        backColor = color;
        colorText.setText(GodUtils.intToString(backColor));
        colorShow.setBackgroundColor(backColor);
        toolbar.setBackgroundColor(GodUtils.TranslateDark(color,30));
        add.setBackgroundColor(GodUtils.TranslateLight(color,30));
        del.setBackgroundColor(GodUtils.TranslateLight(color,30));
        sureButton.setBackgroundColor(GodUtils.TranslateLight(color,30));
    }

}
