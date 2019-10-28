package com.AccentureJava.FilmsProject.Interfaces;

import com.AccentureJava.FilmsProject.Model.Admin;
import com.AccentureJava.FilmsProject.Model.Film;
import com.AccentureJava.FilmsProject.Model.User;

import java.util.Date;
import java.util.List;

public interface FilmOperation {

    public boolean addReview(String imdbIdentifier, User user, String reviewText, double rating);
    public boolean updateReview(String imdbIdentifier, Admin author, int oldReviewId, String reviewText, double rating);
    public boolean deleteReview(String imdbIdentifier, Admin author, int reviewId);
    public List<Film> searchFilmByIdentifier(String imdbIdentifier);
    public List<Film> searchFilmByTitle(String title);
    public List<Film> searchFilmByReleaseDate(Date releaseDate);
}
