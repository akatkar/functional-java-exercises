package com.akatkar.functional.exercises.samples.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;
import static com.akatkar.functional.exercises.samples.collectors.MovieGenre.*;

/**
 *
 * @author Ali Katkar
 */
public class GroupExample {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Lord of the rings", ADVENTURE, 8.8, true),
                new Movie("La la land", ADVENTURE, 7.8, true),
                new Movie("Lolita", DRAMA, 5.0, false),
                new Movie("Back to the future", ADVENTURE, 8.5, true),
                new Movie("Carlito's way", ACTION, 7.9, false),
                new Movie("Pulp fiction", ACTION, 8.9, false));

        Map<MovieGenre, List<Movie>> genres
                = movies.stream()
                        .collect(groupingBy(Movie::getGenre));

        System.out.println(genres);
    }

//   PRINTS : 
//        { 
//          DRAMA=[Movie{Lolita,5.0} NOT WATCHED], 
//          ADVENTURE=[Movie{Lord of the rings,8.8} WATCHED, Movie{La la land,7.8} WATCHED, Movie{Back to the future,8.5} WATCHED], 
//          ACTION=[Movie{Carlito's way,7.9} NOT WATCHED, Movie{Pulp fiction,8.9} NOT WATCHED]          
//        }
}

enum MovieGenre {
    ACTION, ADVENTURE, DRAMA, THRILLER, HORROR;
}

class Movie {

    private String title;
    private Double rating;
    private Boolean watched;
    private MovieGenre genre;

    public Movie(String title, MovieGenre genre, Double rating, Boolean watched) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.watched = watched;
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

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        String s = "Movie{" + title + "," + rating + '}';
        return watched ? s + " WATCHED" : s + " NOT WATCHED";
    }
}
