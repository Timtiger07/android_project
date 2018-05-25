package com.example.ruby.new_project2.day_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ruby.new_project2.R;
import com.example.ruby.new_project2.day_5.Main7Activity;

public class ButtonForListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_for_list_view);
    }

    public void ButtonList1(View view){
        Intent intent = new Intent(ButtonForListView.this,Main5Activity.class);
        startActivity(intent);
    }
    public void ButtonList2(View view){
        Intent intent = new Intent(ButtonForListView.this,Main6Activity.class);
        startActivity(intent);
    }
    public void ButtonList3(View view){
        Intent intent = new Intent(ButtonForListView.this,Main7Activity.class);
        startActivity(intent);
    }
}
