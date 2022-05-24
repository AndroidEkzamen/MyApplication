package com.android.ekzamen;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ActivityOtchet extends AppCompatActivity {

    ArrayAdapter<MyObject> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otchet);
        ListView lvSearch = (ListView) findViewById(R.id.listView_search);

        /* вариант 1
        ArrayList<MyObject> myObjects = (ArrayList<MyObject>) getIntent().getSerializableExtra("MyClass");
        adapter = new MyObjectAdapter(this,R.layout.list_view_item, myObjects);
        lvSearch.setAdapter(adapter);*/

        //вариант 2 и вариант 3
        List<String> otchetStrings = (List<String>) getIntent().getSerializableExtra("MyClass");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, otchetStrings);

        lvSearch.setAdapter(adapter);

    }
}