package com.example.ruby.new_project2.day_1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.ruby.new_project2.day_2.Main2Activity;
import com.example.ruby.new_project2.day_3.Main3Activity;
import com.example.ruby.new_project2.R;
import com.example.ruby.new_project2.day_3_project.Main4Activity;
import com.example.ruby.new_project2.day_4.ButtonForListView;
import com.example.ruby.new_project2.day_4.Main5Activity;
import com.example.ruby.new_project2.week_2_day_2.Fragment;
import com.example.ruby.new_project2.week_2_day_2.Main9Activity;

public class MainActivity extends AppCompatActivity {

    final Context context = this;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void bt1(View v){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

    public void bt2(View v){
        Intent intent = new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent);
    }

    public void bt3(View v){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);


        TextView title = new TextView(this);
// You Can Customise your Title here
        title.setText("Valid Queation");
        title.setPadding(10, 10, 10, 10);
        title.setGravity(Gravity.CENTER);
        title.setTextColor(Color.RED);
        title.setTextSize(20);


        // Title
        alertDialogBuilder.setCustomTitle(title);
        //Message
        alertDialogBuilder.setMessage("Do you really want to Enter?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Intent intent = new Intent(MainActivity.this, ButtonForListView.class);
                startActivity(intent);
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();

        alertDialog.show();
    }

    public void bt4(View v){
        Intent intent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);
    }

    public void bt5(View v){
        Intent intent = new Intent(MainActivity.this, Fragment.class);
        startActivity(intent);

    }

    public void bt6(View v){
        Intent intent = new Intent(MainActivity.this, Main9Activity.class);
        startActivity(intent);

    }

    public void button2(View v){
        finish();
        System.exit(1);
    }

}
