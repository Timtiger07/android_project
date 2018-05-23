package com.example.ruby.new_project2.day_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.ruby.new_project2.R;

public class Main3Activity extends AppCompatActivity {

    private Toolbar TopTool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TopTool = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(TopTool);





        TopTool.setNavigationIcon(R.drawable.round_arrow_back_black_18dp);

        TopTool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main3Activity.this.finish();
               // startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.action_favourite){
            Toast.makeText(Main3Activity.this, "This is a button on toolbar", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
