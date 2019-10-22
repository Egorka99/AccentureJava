package com.AccentureJava.FilmsProject;

import java.util.Date;

public class Admin extends Person {

    private FilmStorage filmStorage = new FilmStorage();

    public Admin() {
        name = "admin";
        login = "admin";
        password = "admin";
    }

    public void updateReview (String imdbIdentifier,int oldReviewId,Review review) {

        for (Film currentFilm: filmStorage.getFilms()) {
            if (currentFilm.getImdbIdentifier().equals(imdbIdentifier)) {
                for (int i = 0; i < currentFilm.reviewList.size(); i++) {
                    if (currentFilm.reviewList.get(i).getReviewId() == oldReviewId) {
                        currentFilm.reviewList.set(i,review);
                    }
                }
                currentFilm.reviewList.add(review);
            }
        }
    }

    public void deleteReview (String imdbIdentifier, int reviewId) {
        for (Film currentFilm: filmStorage.getFilms()) {
            if (currentFilm.getImdbIdentifier().equals(imdbIdentifier)) {
                for (int i = 0; i < currentFilm.reviewList.size(); i++) {
                    if (currentFilm.reviewList.get(i).getReviewId() == reviewId) {
                        currentFilm.reviewList.remove(i);
                    }
                }
            }
        }
    }







}
