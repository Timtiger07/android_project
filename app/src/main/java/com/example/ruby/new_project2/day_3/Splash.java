package com.example.ruby.new_project2.day_3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ruby.new_project2.R;
import com.example.ruby.new_project2.day_1.MainActivity;

public class Splash extends AppCompatActivity {
    private static int SPLASH_TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME );
    }
}
