package com.example.volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CubeActivity extends AppCompatActivity {

    TextView showVolume;
    Button calculateVolume;
    EditText getLength,getHeight,getWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cube);

        showVolume = findViewById(R.id.showVolume);
        getLength = findViewById(R.id.getLength);
        getHeight = findViewById(R.id.getHeight);
        getWidth = findViewById(R.id.getWidth);
        calculateVolume = findViewById(R.id.calculateVolume);

        calculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String h = getHeight.getText().toString();
                String l = getLength.getText().toString();
                String w = getWidth.getText().toString();



                Double volume = (Integer.parseInt(h))*(Integer.parseInt(l))*(Integer.parseInt(w)*1.0);
                showVolume.setText("Volume: "+volume+"");


            }
        });
    }
}