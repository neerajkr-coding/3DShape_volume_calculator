package com.example.volumeareaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    GridView gridView;
    ArrayList<Shape> shapeArrayList;

    MyCustomAdaptor adaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        gridView= findViewById(R.id.gridView);

        shapeArrayList = new ArrayList<>();
        shapeArrayList.add(new Shape("Cuboid",R.drawable.cuboid));
        shapeArrayList.add(new Shape("Cylinder",R.drawable.cylinder));
        shapeArrayList.add(new Shape("Sphere",R.drawable.sphere));
        shapeArrayList.add(new Shape("Cone",R.drawable.cone));
        shapeArrayList.add(new Shape("Cube",R.drawable.cube));
        shapeArrayList.add(new Shape("Hemisphere",R.drawable.hemisphere));

        adaptor = new MyCustomAdaptor(getApplicationContext(),shapeArrayList);

        gridView.setAdapter(adaptor);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;

                if(i==2){
                    intent = new Intent(getApplicationContext() , SphereActivity.class);
                    startActivity(intent);

                }else if(i==0){
                    intent = new Intent(getApplicationContext() , CubeActivity.class);
                    startActivity(intent);
                }else if(i==1){
                    intent = new Intent(getApplicationContext() , CylinderActivity.class);
                    startActivity(intent);
                }else if(i==3){
                    intent = new Intent(getApplicationContext() , ConeActivity.class);
                    startActivity(intent);
                }else if(i==4){
                    intent = new Intent(getApplicationContext() , activity_realcube.class);
                    startActivity(intent);
                }else if(i==5){
                    intent = new Intent(getApplicationContext() , hemisphereActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}