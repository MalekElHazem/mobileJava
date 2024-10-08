package com.example.tp2;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button size, italic, bold, valider;
        TextView text1;
        EditText val;


        size = findViewById(R.id.size);
        italic = findViewById(R.id.italic);
        bold = findViewById(R.id.bold);
        valider = findViewById(R.id.valider);

        val = findViewById(R.id.val);

        text1 = findViewById(R.id.text1);

        val.setVisibility(View.INVISIBLE);
        valider.setVisibility(View.INVISIBLE);

        size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val.setVisibility(View.VISIBLE);
                valider.setVisibility(View.VISIBLE);
            }
        });

        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int taille = Integer.parseInt(val.getText().toString());
                text1.setTextSize(taille);
            }
        });

        italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
            }
        });

        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            }
        });


    }
}