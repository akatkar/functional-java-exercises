package com.akatkar.functional.exercises.chapter2;

import java.util.Arrays;

/**
 * All exercises should be completed using Lambda expressions and the new
 * methods added to JDK 8 where appropriate. There is no need to use an explicit
 * loop in any of the code. Use method references rather than full lambda
 * expressions wherever possible.
 */
public class Exercise09 {

    // Sort movies as not watched first and highest rating first like below
    // 
    // Movie{Pulp fiction,8.9} NOT WATCHED
    // Movie{Carlito's way,7.9} NOT WATCHED
    // Movie{Lolita,5.0} NOT WATCHED
    // Movie{Lord of the rings,8.8} WATCHED
    // Movie{Back to the future,8.5} WATCHED
    // Movie{La la land,7.8} WATCHED
    private void exercise9() {
        
        /* YOUR CODE HERE */
    }

    public static void main(String[] args) {
        new Exercise09().exercise9();
    }
}

class Movie {

    private String title;
    private Double rating;
    private Boolean watched;

    public Movie(String title, Double rating, Boolean watched) {
        this.title = title;
        this.rating = rating;
        this.watched  = watched;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getWatched() {
        return watched;
    }

    public void setWatched(Boolean watched) {
        this.watched = watched;
    }
    
    @Override
    public String toString() {
        String s = "Movie{" + title + "," + rating + '}';
        return watched ? s + " WATCHED" : s + " NOT WATCHED";
    }
}
