package com.example.aniqa.myapplication2;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    Activity context;
    ArrayList<String> peoples;
    ArrayList<String> countries;
    ListViewAdapter(Activity context, ArrayList<String> peoples, ArrayList<String> countries)
    {
        this.context= context;
        this.peoples=peoples;
        this.countries=countries;
    }
    @Override
    public int getCount() {
        return peoples.size();
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
        if(view== null)
        {
            view=context.getLayoutInflater().inflate(R.layout.customlistitem, viewGroup, false);
        }
        TextView dummyText=view.findViewById(R.id.textView1);
        TextView dummyText2=view.findViewById(R.id.textView2);
        String peoplesText= peoples.get(i).toString();
        String countryText=countries.get(i).toString();
        dummyText.setText(peoplesText);
        dummyText2.setText(countryText);

        return  view;
    }
}
