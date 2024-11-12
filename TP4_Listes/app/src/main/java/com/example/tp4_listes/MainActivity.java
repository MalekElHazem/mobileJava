package com.example.tp4_listes;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        AutoCompleteTextView cmplt= findViewById(R.id.autoCompleteTextView);

        ListView liste= findViewById(R.id.listview);

        String[] notes = getResources().getStringArray(R.array.notes);

        ArrayAdapter <String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, notes);

        liste.setAdapter(adapter);
//

        String matieres[] = {"Algoritmique", "Android","Programmation C","Programmation OO"};

        ArrayAdapter <String> adapter2 = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, matieres);
        cmplt.setAdapter(adapter2);

        cmplt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String input = cmplt.getText().toString();
                Toast.makeText(MainActivity.this, "la nouvelle matiere est " + input, Toast.LENGTH_SHORT).show();
            }
        });

        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //view.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));

                String selectedNote = (String) liste.getItemAtPosition(i);
                Integer x = Integer.parseInt(selectedNote);

                if( x>= 10){
                    view.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    Toast.makeText(MainActivity.this, "reussi avec moyenne " + x, Toast.LENGTH_SHORT).show();
                }else {
                    view.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    Toast.makeText(MainActivity.this, "echoue avec moyenne " + x, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}