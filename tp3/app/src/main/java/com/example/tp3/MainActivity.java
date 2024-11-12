package com.example.tp3;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // MainActivity.java
        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(v -> {
            // Validate each field
            EditText ageField = findViewById(R.id.ageField);
            String ageText = ageField.getText().toString();
            try {
                int age = Integer.parseInt(ageText);
                ageField.setBackgroundColor(Color.GREEN);
            } catch (NumberFormatException e) {
                ageField.setBackgroundColor(Color.RED);
            }
            // Repeat for other fields...
        });
    }



}
