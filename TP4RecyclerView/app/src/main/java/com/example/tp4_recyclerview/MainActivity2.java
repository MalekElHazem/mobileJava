package com.example.tp4_recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.my_row);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        //Déclaration de la liste
        RecyclerView rv;
        List<Movie> movieList = new ArrayList<>();

        //Ajout des données à la liste
        Movie movie = new Movie("Mad Max: Fury Road",R.drawable.madmax);
        movieList.add(movie);
        movie = new Movie("The Martian", R.drawable.themartian);
        movieList.add(movie);
        movie = new Movie("Shaun the Sheep",R.drawable.shaun);
        movieList.add(movie);



        rv = findViewById(R.id.rv);
        Adapter2 adapter = new Adapter2(movieList);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }
}