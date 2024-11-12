package com.example.tp4_recyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

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
        RecyclerView rv;
        List<Movie> movieList = new ArrayList<>();


        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure",
                "2015");movieList.add(movie);
        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);
        movie = new Movie("Star Wars: Episode VII - The Force Awakens","Action",
                "2015");movieList.add(movie);
        movie = new Movie("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);
        movie = new Movie("The Martian", "Science Fiction & Fantasy",
                "2015");movieList.add(movie);
        movie = new Movie("Mission: Impossible Rogue Nation", "Action",
                "2015");movieList.add(movie);
        movie = new Movie("Up", "Animation", "2009");movieList.add(movie);
        movie = new Movie("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);
        movie = new Movie("The LEGO Movie", "Animation", "2014");
        movieList.add(movie);
        movie = new Movie("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);
        movie = new Movie("Aliens", "Science Fiction", "1986");
        movieList.add(movie);
        movie = new Movie("Chicken Run", "Animation", "2000");
        movieList.add(movie);
        movie = new Movie("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);
        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure",
                "1981");movieList.add(movie);
        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);



        rv = findViewById(R.id.rv);
        Adapter adapter = new Adapter(movieList);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));


        adapter.setOnItemLongClickListener(movie1 -> {
                Toast.makeText(MainActivity.this, 
                "Movie name: " + movie1.getName(),
                Toast.LENGTH_SHORT).show();
                return true;
        });



    }
}