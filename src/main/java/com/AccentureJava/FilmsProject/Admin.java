package com.AccentureJava.FilmsProject;

public class Admin extends Person {
    public Admin() {
        name = "admin";
        login = "admin";
        password = "admin";
    }

    public void updateReview (Film film,int oldReviewId,Review review) {
            for (Review currentReview : film.getReview()) {
                 if (currentReview.getReviewId() == oldReviewId) {
                      //TODO Доделать review update
                 }
            }
    }

    public void deleteReview(Film film, int reviewId) {

    }







}
