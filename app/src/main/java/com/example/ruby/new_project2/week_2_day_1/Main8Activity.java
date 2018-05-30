package com.example.ruby.new_project2.week_2_day_1;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ruby.new_project2.R;

public class Main8Activity extends AppCompatActivity {
    CountDownTimer cdt;
    EditText ed1;
    TextView tv1;
    int j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        tv1 = (TextView)findViewById(R.id.tv1);
        ed1 = (EditText)findViewById(R.id.ed1);

    }

    public void buttonStart(View v) {
        int clockCount = Integer.parseInt(ed1.getText().toString());
        j=1;
        if(clockCount>0) {
            cdt = new CountDownTimer(1000 * clockCount , 1000) {

                public void onTick(long millisUntilFinished) {
                    tv1.setText("seconds remaining: " + millisUntilFinished / 1000);
                }

                public void onFinish() {
                    ed1.setText("done!");

                    stopService(new Intent(Main8Activity.this, MyService.class));
                    startService(new Intent(
                            Main8Activity.this, MyService.class));
                }
            }.start();

        }


    }

    public void buttonStop(View v){

        stopService(new Intent(this, MyService.class));
        if(j==1){cdt.cancel();}
    }



}
