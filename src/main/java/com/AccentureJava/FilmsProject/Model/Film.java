package com.AccentureJava.FilmsProject.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Film {
    private String title;
    private String imdbIdentifier;
    private FilmType filmType;
    private String genre;
    private Date releaseDate;
    private double rating;
    private String description;
    private List<Review> reviewList;
    private List<newFilmListener> listeners = new ArrayList<>();

    public Film(String title, String imdbIdentifier, FilmType filmType, String genre, Date releaseDate, double rating, String description) {
        this.title = title;
        this.imdbIdentifier = imdbIdentifier;
        this.filmType = filmType;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.description = description;

        for (newFilmListener listener : listeners)
            listener.newFilmCreated(this);

        reviewList = new ArrayList<>();
    }

    public void addListener(newFilmListener listener) {
        listeners.add(listener);
    }


    public String getTitle() {
        return title;
    }

    public String getImdbIdentifier() {
        return imdbIdentifier;
    }

    public FilmType getFilmType() {
        return filmType;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }
    public Review getReviewFromListByIndex(int index) {
        return reviewList.get(index);
    }

    public void addReviewInList(Review review) {
       reviewList.add(review);
    }

    public void replaceReview(int index,Review review) {
       reviewList.set(index,review);
    }

    public void removeReviewFromList(int index) {
        reviewList.remove(index);
    }


}
