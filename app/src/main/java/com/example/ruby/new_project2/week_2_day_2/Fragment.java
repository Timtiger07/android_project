package com.example.ruby.new_project2.week_2_day_2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.ruby.new_project2.R;

public class Fragment extends AppCompatActivity {

    int counter;
    FragmentTransaction ft;
    FragmentManager fm;
    BlankFragment frag;
    BlankFragment2 frag2;
    TextView tv1;
    private Toolbar toolbar ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        tv1 = (TextView)findViewById(R.id.tv1);
        fm = getSupportFragmentManager();
        frag = new BlankFragment();
        frag2 = new BlankFragment2();

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.round_arrow_back_black_18dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment.this.finish();
                //startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

    }

    public void clk(View v) {
        ft = fm.beginTransaction();

        if(counter!=1){
            ft.add(R.id.fragment_container,frag);
            counter=1;
            ft.commit();
        }
        else{
           if(counter == 1){
            ft.remove(frag);
            counter=0;
            ft.commit();
            }
        }
    }

    public void clk2(View v){
        if(counter == 1){
            counter = 0;
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, frag2).commit();
        }
    }

}
