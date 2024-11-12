package com.example.tp4_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Movie> movieList;
    private OnItemLongClickListener longClickListener;


    public Adapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.titleText.setText(movie.getName());
        holder.genreText.setText(movie.getGenre());
        holder.yearText.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public interface OnItemLongClickListener {
        boolean onItemLongClick(Movie movie);
    }

    public void setOnItemLongClickListener(OnItemLongClickListener listener) {
        this.longClickListener = listener;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView titleText, genreText, yearText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.title);
            genreText = itemView.findViewById(R.id.genre);
            yearText = itemView.findViewById(R.id.year);

            itemView.setOnLongClickListener(v -> {
                int position = getAdapterPosition();
                if (longClickListener != null && position != RecyclerView.NO_POSITION) {
                    return longClickListener.onItemLongClick(movieList.get(position));
                }
                return false;
            });
        }
    }
}
