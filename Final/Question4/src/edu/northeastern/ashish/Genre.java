package edu.northeastern.ashish;

import java.util.ArrayList;

public class Genre {
    String name;
    ArrayList<Movie> movies;

    public Genre(String name){
        this.name = name;
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }




}
