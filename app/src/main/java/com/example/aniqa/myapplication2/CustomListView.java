package com.example.aniqa.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {
    ArrayList<String> peoples;
    ArrayList<String> countries;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        listView=findViewById(R.id.listView2);
        peoples= new ArrayList<String>();
        countries=new ArrayList<String>();

        peoples.add("Sneha");
        peoples.add("Sumaiya");
        peoples.add("Shipa");
        peoples.add("Amina");
        peoples.add("Mahmuda");

        countries.add("United Kingdom");
        countries.add("Australia");
        countries.add("Canada");
        countries.add("USA");
        countries.add("Switzerland");

        ListViewAdapter adapter= new ListViewAdapter(this, peoples,countries);
        listView.setAdapter(adapter);
    }
}
