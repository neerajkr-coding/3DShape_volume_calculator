package com.example.volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConeActivity extends AppCompatActivity {

    TextView showVolume;
    Button calculateVolume;
    EditText getRadius,getHeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        showVolume = findViewById(R.id.showVolume);
        getRadius = findViewById(R.id.getRadius);
        getHeight = findViewById(R.id.getHeight);
        calculateVolume = findViewById(R.id.calculateVolume);


        calculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String R = getRadius.getText().toString();
                String H = getHeight.getText().toString();


                int r = Integer.parseInt(R);
                int h = Integer.parseInt(H);

                Double volume = (1.0/3.0)*(22.0/7.0)*h*r*r;
                showVolume.setText("Volume: "+volume);

            }
        });

    }
}