package com.example.ruby.new_project2.week_2_day_5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.ruby.new_project2.R;

public class Main13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        Subject subject = (Subject) getIntent().getParcelableExtra("parcel_data");

        TextView textView = (TextView)findViewById(R.id.tv1);
        TextView text2View = (TextView)findViewById(R.id.tv2);

        textView.setText(subject.Subject_ID);
        text2View.setText(subject.Subject_Name);
    }

    public void exit(View view){
        finish();
    }
}

