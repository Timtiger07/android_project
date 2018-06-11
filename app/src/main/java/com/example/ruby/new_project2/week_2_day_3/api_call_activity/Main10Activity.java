package com.example.ruby.new_project2.week_2_day_3.api_call_activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.ruby.new_project2.R;
import com.example.ruby.new_project2.week_2_day_3.async_task.SampleAsync;
import com.example.ruby.new_project2.week_2_day_3.constants.ApplicationConstants;
import com.example.ruby.new_project2.week_2_day_3.interfaces.SampleInterface;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Main10Activity extends AppCompatActivity implements  SampleInterface,View.OnClickListener {

    private Button BTN_click;
    private SampleInterface mInterface;
    private String str_Name;
    ArrayList<JSONObject> contactObj;
    JSONObject mContactObj;
    SampleAsync mAsync;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        BTN_click  = (Button)findViewById(R.id.btn_click);
        BTN_click.setOnClickListener(this);
        mInterface = this;
        mAsync = new SampleAsync(Main10Activity.this, mInterface);
        contactObj = new ArrayList<JSONObject>();

    }

    @Override
    protected void onStart() {
        super.onStart();
        mAsync.execute();
//        Log.d("ArrayLIST size","str_Name " + contactObj.size());
//        for(int i=0;i<contactObj.length;i++){
//
//        }

    }

    @Override
    public void onClick(View v) {
        if(v == BTN_click){

            if(ApplicationConstants.isNetworkAvailable(Main10Activity.this)) {

                mAsync.execute();
            }else{
                ApplicationConstants.
                        ShowAlert(Main10Activity.this,"No Internet Error","please connect tot internet",false);
            }

        }

    }

    @Override
    public void OnResult(String result) {

        if(result != null){
            try {
                JSONObject mJsonObj = new JSONObject(result);
                if(mJsonObj != null){
                    JSONArray mContactArray = mJsonObj.getJSONArray("contacts");
//                    Log.d("bharat","str_Name " + mContactArray.length());
                    if(mContactArray.length() > 0){
                        for(int i=0; i<mContactArray.length();i++){
                            mContactObj = mContactArray.getJSONObject(i);
//                            contactObj = (Contact) mContactObj;

                            contactObj.add(mContactObj);
                            Log.d("bharat","str_Name " + contactObj.size());
                            if(mContactObj != null){
                                if(mContactObj.has("name")){
                                    if(mContactObj.getString("name") != null){
                                        str_Name = mContactObj.getString("name");
//                                        Log.d("bharat","str_Name " + contactObj.size());

                                    }
                                }
                            }
                        }
//                        Log.d("bharat","str_Name " + contactObj.size());




                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            ApplicationConstants.ShowAlert(Main10Activity.this,"No Response from server","",false);
        }
    }
}
