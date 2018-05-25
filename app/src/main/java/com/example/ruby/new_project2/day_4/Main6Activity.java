package com.example.ruby.new_project2.day_4;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ruby.new_project2.R;

public class Main6Activity extends AppCompatActivity {

    private Toolbar toolbar;
    Context context;
    ListView simpleList;
    String countryList[] = {"Cristiano Ronaldo","Gareth Bale","Jese Rodriguez","Zlatan Ibrahimovic","Nemanja Vidic","Wayne Rooney"};
    int flags[] = {R.drawable.cristianoronaldo,R.drawable.garethbale,R.drawable.rodriguez,R.drawable.zlatanibrahimovic,R.drawable.nemanjavidic,R.drawable.waynerooney};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter_helper customAdapter = new CustomAdapter_helper(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.round_arrow_back_black_18dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main6Activity.this.finish();
            }
        });

    }


}
