package com.assignment.acadgild.android_session4_assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.assignment.acadgild.android_session4_assignment3.adapter.GridViewAdapter;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    GridViewAdapter gridViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridView);

        int[] ImgLists = {R.drawable.gingerbread,
                R.drawable.honeycomb,
                R.drawable.icecreamsandwich,
                R.drawable.jellybean,
                R.drawable.kitkat,
                R.drawable.lollipop};
        String[] VersionName = {"GingerBread", "Honeycomb", "IceCreamSandwich", "Jellybean", "Kitkat", "Lollipop"};

        GridViewAdapter gridViewAdapter = new GridViewAdapter(this, ImgLists, VersionName);

        gridView.setAdapter(gridViewAdapter);


    }


}
