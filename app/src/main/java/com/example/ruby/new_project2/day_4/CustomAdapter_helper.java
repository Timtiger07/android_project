package com.example.ruby.new_project2.day_4;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ruby.new_project2.R;
import com.example.ruby.new_project2.day_1.MainActivity;


public class CustomAdapter_helper extends BaseAdapter {
    Context context;
    String name[];
    int player_image[];
    LayoutInflater inflter;
    TextView country;


    public CustomAdapter_helper(Context applicationContext, String[] name, int[] player_image) {
        this.context = context;
        this.name = name;
        this.player_image = player_image;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_custom_adapter_helper, null);
        country = (TextView)           view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        country.setText(name[i]);
        icon.setImageResource(player_image[i]);
        return view;
    }

}
