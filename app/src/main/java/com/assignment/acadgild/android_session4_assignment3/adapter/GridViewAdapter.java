package com.assignment.acadgild.android_session4_assignment3.adapter;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.assignment.acadgild.android_session4_assignment3.R;
import com.assignment.acadgild.android_session4_assignment3.model.Img;

import java.util.ArrayList;


/**
 * Created by Mukund on 08-03-16.
 */
public class GridViewAdapter extends BaseAdapter {

    private Context context;
    String[] vName;
    int[] imgList;
    LayoutInflater inflater;

    public GridViewAdapter(Context context, int[] ImageList, String[] VersionName) {
        this.context = context;
        this.imgList = ImageList;
        this.vName = VersionName;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return imgList.length;
    }

    @Override
    public Object getItem(int position) {
        return imgList[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.grid_item_layout, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        TextView textView = (TextView) convertView.findViewById(R.id.text);


        Img img = new Img(imgList[position], vName[position]);

        imageView.setImageResource(img.getImgSrc());
        textView.setText(img.getImgName());

        return convertView;
    }


}
