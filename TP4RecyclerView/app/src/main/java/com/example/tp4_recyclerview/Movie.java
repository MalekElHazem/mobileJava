package com.example.tp4_recyclerview;

public class Movie {
    private String name;
    private String genre;
    private String year;
    private int imgURL;

    public Movie(String name, int imgURL) {
        this.name = name;
        this.imgURL = imgURL;
    }

    public Movie(String name, String genre, String year) {
        this.name = name;
        this.genre = genre;
        this.year = year;
    }

    public int getImgURL() {
        return imgURL;
    }

    public void setImgURL(int imgURL) {
        this.imgURL = imgURL;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
