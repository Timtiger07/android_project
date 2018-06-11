package com.example.ruby.new_project2.week_2_day_5;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ruby.new_project2.R;

import java.util.List;

/**
 * Created by ruby on 11/6/18.
 */

public class ListViewAdapter extends BaseAdapter {

    Context context;

    List<Subject> TempSubjectList;

    public ListViewAdapter(List<Subject> listValue, Context context)
    {
        this.context = context;
        this.TempSubjectList = listValue;
    }

    @Override
    public int getCount()
    {
        return this.TempSubjectList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return this.TempSubjectList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewItem viewItem = null;

        if(convertView == null)
        {
            viewItem = new ViewItem();

            LayoutInflater layoutInfiater = (LayoutInflater)this.context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInfiater.inflate(R.layout.listview_items, null);

            viewItem.IdTextView = (TextView)convertView.findViewById(R.id.textviewID);

            viewItem.NameTextView = (TextView)convertView.findViewById(R.id.textviewSubjectName);

            convertView.setTag(viewItem);
        }
        else
        {
            viewItem = (ViewItem) convertView.getTag();
        }

        viewItem.IdTextView.setText(TempSubjectList.get(position).Subject_ID);

        viewItem.NameTextView.setText(TempSubjectList.get(position).Subject_Name);

        return convertView;
    }
}

class ViewItem
{
    TextView IdTextView;
    TextView NameTextView;
}