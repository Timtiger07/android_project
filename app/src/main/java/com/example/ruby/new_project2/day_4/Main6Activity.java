package com.example.ruby.new_project2.day_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ruby.new_project2.CustomAdapter_helper;
import com.example.ruby.new_project2.R;

public class Main6Activity extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"India"};
    int flags[] = {R.drawable.logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter_helper customAdapter = new CustomAdapter_helper(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}
