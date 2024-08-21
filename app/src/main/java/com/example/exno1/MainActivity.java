package com.example.exno1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private float currentTextSize;
    private int ch = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);

        TextView textview = findViewById(R.id.textView);
        Button colorbut = findViewById(R.id.color);
        Button fontbut = findViewById(R.id.font);
        currentTextSize = textview.getTextSize() / getResources().getDisplayMetrics().scaledDensity;

        colorbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentTextSize += 5;
                textview.setTextSize(currentTextSize);
            }
        });
        fontbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(ch){
                    case 1:
                        textview.setTextColor(Color.CYAN);
                    case 2:
                        textview.setTextColor(Color.GREEN);
                }
            }
        });
    }
}