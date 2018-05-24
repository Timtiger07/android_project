package com.example.ruby.new_project2.day_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ruby.new_project2.R;

import java.net.SocketImpl;

public class Main5Activity extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"India", "China", "Australia", "Portugal", "America", "New Zealand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list__view, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);}


}
