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

public class activity_realcube extends AppCompatActivity {

    TextView showVolume;
    Button calculateVolume;
    EditText getRadius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realcube);

        showVolume = findViewById(R.id.showVolume);
        getRadius = findViewById(R.id.getRadius);
        calculateVolume = findViewById(R.id.calculateVolume);

        calculateVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = getRadius.getText().toString();

                int r = Integer.parseInt(text);

                if(r>0){
                    Double volume = r*r*r*1.0;
                    showVolume.setText("Volume: "+volume);
                }else{
                    Toast.makeText(activity_realcube.this, "Enter a valid Radius", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}