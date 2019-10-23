package com.AccentureJava.FilmsProject.Controller;

import com.AccentureJava.FilmsProject.Model.*;

import java.util.Date;

public class FilmOperation {

    private FilmStorage filmStorage = new FilmStorage();

    public boolean addReview(String imdbIdentifier, User user, String reviewText, double rating) {
        Date currentDate = new Date();
        Review review = new Review(currentDate,user,reviewText,rating);

        for (Film currentFilm: filmStorage.getFilms()) {
            if (currentFilm.getImdbIdentifier().equals(imdbIdentifier)) {
                currentFilm.addReviewInList(review);
                return true;
            }
        }
        return false;
    }

    public boolean updateReview(String imdbIdentifier, Admin admin, int oldReviewId, String reviewText, double rating) {
        Date currentDate = new Date();
        Review review = new Review(currentDate,admin,reviewText,rating);

        for (Film currentFilm: filmStorage.getFilms()) {
        if (currentFilm.getImdbIdentifier().equals(imdbIdentifier)) {
            for (int i = 0; i < currentFilm.getReviewList().size(); i++) {
                if (currentFilm.getReviewFromListByIndex(i).getReviewId() == oldReviewId) {
                    currentFilm.replaceReview(i,review);
                    return true;
                }
            }
                currentFilm.addReviewInList(review);
            }
        }
        return false;
    }

    public boolean deleteReview(String imdbIdentifier, Admin admin, int reviewId) {

        if (admin != null) {
            for (Film currentFilm: filmStorage.getFilms()) {
                if (currentFilm.getImdbIdentifier().equals(imdbIdentifier)) {
                    for (int i = 0; i < currentFilm.getReviewList().size(); i++) {
                        if (currentFilm.getReviewFromListByIndex(i).getReviewId() == reviewId) {
                            currentFilm.removeReviewFromList(i);
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }



}
