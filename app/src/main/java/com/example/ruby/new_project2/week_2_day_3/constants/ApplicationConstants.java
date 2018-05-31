package com.example.ruby.new_project2.week_2_day_3.constants;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by ruby on 31/5/18.
 */

public class ApplicationConstants {

    private static ProgressDialog pDialog;
    public static boolean callApi = true;
    public static int SELECT_FILE = 1;
    public static String str_KEY_Category = "1";

    public static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public static void hideSoftKeyboard(Context context, EditText view) {
        try {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static String convertInputStreamToString(InputStream is)
            throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static boolean isNetworkAvailable(Context context) {
        // Log.d("fragment_order_history","isNetworkAvailable");

        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }

        }
        return false;

    }

// To show progress dialog
    public static void showProgressDialog(Context mContext, String mTitle,
                                          String mMessage) {
        pDialog = new ProgressDialog(mContext);
        pDialog.setCancelable(false);
        pDialog.setTitle("Loading");
        pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pDialog.getProgress();
        pDialog.show();
    }

    public static void hideProgressDialog(Context mContext) {
        if (pDialog != null) {
            pDialog.dismiss();
        } else {
            pDialog = new ProgressDialog(mContext);
            pDialog.dismiss();
        }
    }


    public static void ShowAlert(final Context mContext, String mTitle,
                                 String mMessage, boolean isCancelBtn) {

            new AlertDialog.Builder(mContext)
                    .setTitle(mTitle)
                    .setMessage(mMessage)
                    .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .show();

    }

}


