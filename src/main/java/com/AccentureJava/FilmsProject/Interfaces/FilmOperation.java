package com.AccentureJava.FilmsProject.Interfaces;

import com.AccentureJava.FilmsProject.Model.Admin;
import com.AccentureJava.FilmsProject.Model.Film;
import com.AccentureJava.FilmsProject.Model.User;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface FilmOperation {

    boolean addReview(String imdbIdentifier, User user, String reviewText, double rating);
    boolean updateReview(String imdbIdentifier, Admin author, int oldReviewId, String reviewText, double rating);
    boolean deleteReview(String imdbIdentifier, Admin author, int reviewId);
}
