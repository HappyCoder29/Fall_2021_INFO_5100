package edu.northeastern.ashish;

import java.util.ArrayList;

public class Netflix {
    ArrayList<Genre> genres;

    public Netflix(){
        this.genres = new ArrayList<>();
    }

    public void addGenre(Genre genre){
        this.genres.add(genre);
    }
}
