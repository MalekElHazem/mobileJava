package com.example.tp4_listes;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tp4_listes.R;

public class MatiereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Initialize the AutoCompleteTextView
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.matiere);

        // Define the subjects array
        String[] matieres = {"Algoritmique", "Android", "Programmation C", "Programmation OO"};

        // Create an ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, matieres);

        // Set the adapter to the AutoCompleteTextView
        autoCompleteTextView.setAdapter(adapter);

        // Set an item click listener for the AutoCompleteTextView
        autoCompleteTextView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedMatiere = (String) parent.getItemAtPosition(position);
            Toast.makeText(MatiereActivity.this, selectedMatiere, Toast.LENGTH_SHORT).show();
        });
    }
}
