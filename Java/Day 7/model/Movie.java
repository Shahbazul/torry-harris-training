package com.torryharris.model;

public class Movie implements Comparable<Movie>{
    private String title;
    private int year;
    private Float imdRating;
    private Float collection;

    public Movie() {
    }

    public Movie(String title, int year, Float imdRating, Float collection) {
        this.title = title;
        this.year = year;
        this.imdRating = imdRating;
        this.collection = collection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Float getImdRating() {
        return imdRating;
    }

    public void setImdRating(Float imdRating) {
        this.imdRating = imdRating;
    }

    public Float getCollection() {
        return collection;
    }

    public void setCollection(Float collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", imdRating=" + imdRating +
                ", collection=" + collection +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return (this.getTitle().compareTo(o.getTitle()));
    }
}
