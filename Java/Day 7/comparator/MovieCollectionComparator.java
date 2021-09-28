package com.torryharris.comparator;

import com.torryharris.drive.MovieDemo;
import com.torryharris.model.Movie;

import java.util.Comparator;

public class MovieCollectionComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return (o2.getCollection().compareTo(o1.getCollection()));
    }
}
