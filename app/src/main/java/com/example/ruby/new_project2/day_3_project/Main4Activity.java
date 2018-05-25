package com.example.ruby.new_project2.day_3_project;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ruby.new_project2.R;

public class Main4Activity extends AppCompatActivity {

    private Toolbar toolbar;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.round_arrow_back_black_18dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main4Activity.this.finish();
            }
        });

        ed1 = (EditText)findViewById(R.id.id);
        ed2 = (EditText)findViewById(R.id.pass);

    }


    public void login(View v){
    Toast.makeText(getBaseContext(),"ID: "+ed1.getText().toString(),Toast.LENGTH_SHORT).show();
    Toast.makeText(getBaseContext(),"Password: "+ed1.getText().toString(),Toast.LENGTH_SHORT).show();
    }

}
