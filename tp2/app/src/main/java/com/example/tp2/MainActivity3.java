package com.example.tp2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.color);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.maincolor), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button Red, Blue, Purple, Green;
        TextView text1;


        Red = findViewById(R.id.Red);
        Blue = findViewById(R.id.Blue);
        Purple = findViewById(R.id.Purple);
        Green = findViewById(R.id.Green);

        text1 = findViewById(R.id.text1);

        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.red);
                text1.setBackgroundColor(c);
            }
        });

        Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.blue);
                text1.setBackgroundColor(c);
            }
        });

        Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.green);
                text1.setBackgroundColor(c);
            }
        });

        Purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = getResources().getColor(R.color.purple);
                text1.setBackgroundColor(c);
            }
        });
    }
}