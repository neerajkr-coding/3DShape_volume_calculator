package com.example.volumeareaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdaptor extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapeArrayList;
    private Context context;

    public MyCustomAdaptor(@NonNull Context context,ArrayList<Shape> shapeArrayList) {
        super(context, R.layout.item_gridview, shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;
    }

    private static class ViewHolder{
        TextView shapeName;
        ImageView shapeImage;

//        ViewHolder(TextView shapeName,ImageView shapeImage){
//            this.shapeName=shapeName;
//            this.shapeImage=shapeImage;
//        }
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Shape shape = getItem(position);

        ViewHolder holder;

        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_gridview,parent,false);

            holder = new ViewHolder();
            holder.shapeImage = convertView.findViewById(R.id.shapeImage);
            holder.shapeName = convertView.findViewById(R.id.shapeName);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.shapeName.setText(shape.shapeName);
        holder.shapeImage.setImageResource(shape.imageRes);

        return convertView;
    }
}
