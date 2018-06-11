package com.example.ruby.new_project2.week_2_day_5;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ruby on 11/6/18.
 */

public class Subject implements Parcelable {

    public String Subject_ID;
    public String Subject_Name;

    Subject(Parcel in){
        Subject_ID = in.readString();
        Subject_Name = in.readString();
    }

    Subject(){super();}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Subject_ID);
        parcel.writeString(Subject_Name);
    }

    public static final Parcelable.Creator<Subject>CREATOR = new Parcelable.Creator<Subject>() {
        public Subject createFromParcel(Parcel in) {
            return new Subject(in);
        }

        public Subject[] newArray(int size) {
            return new Subject[size];
        }
    };
}