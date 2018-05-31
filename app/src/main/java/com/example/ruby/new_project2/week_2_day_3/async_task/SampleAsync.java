package com.example.ruby.new_project2.week_2_day_3.async_task;

import android.content.Context;
import android.os.AsyncTask;

import com.example.ruby.new_project2.week_2_day_3.constants.ApplicationConstants;
import com.example.ruby.new_project2.week_2_day_3.interfaces.SampleInterface;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.util.concurrent.TimeUnit;

/**
 * Created by ruby on 31/5/18.
 */

public class SampleAsync extends AsyncTask<Void,Void,String> {


        private Context mContext;
        private SampleInterface mInterface;

    public SampleAsync(Context mContext, SampleInterface mInterface) {

            this.mContext = mContext;
            this.mInterface = mInterface;

        }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        ApplicationConstants.showProgressDialog(mContext,"Sample App","Wait....");
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        ApplicationConstants.hideProgressDialog(mContext);
        mInterface.OnResult(s);
    }

    @Override
    protected String doInBackground(Void... voids) {
        OkHttpClient client = new OkHttpClient();
        client.setConnectTimeout(15, TimeUnit.SECONDS); // connect timeout
        client.setReadTimeout(15, TimeUnit.SECONDS);

        try {

           /* RequestBody formBody = new FormEncodingBuilder()
                    .add("password", str_Pass)
                    .add("tohoid", str_tohoid)

                    .build();*/

            Request request = new Request.Builder()
                    .url("http://api.androidhive.info/contacts/")
                    //  .post(formBody)
                    .build();

            Response response = client.newCall(request).execute();
            String Result = response.body().string();


            return Result;
        }catch(Exception e){
            e.printStackTrace();
        }


        return null;
    }



}