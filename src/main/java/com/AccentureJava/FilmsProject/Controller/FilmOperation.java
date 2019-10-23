package com.AccentureJava.FilmsProject.Controller;

import com.AccentureJava.FilmsProject.Model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilmOperation {

    private FilmStorage filmStorage = (FilmStorage) FilmStorage.getInstance();

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

    public List<Film> searchFilmByIdentifier(String imdbIdentifier) {
        List<Film> foundFilmsList = new ArrayList<>();
        for (Film currentFilm : filmStorage.getFilms()) {
            if (currentFilm.getImdbIdentifier().equals(imdbIdentifier)) {
                foundFilmsList.add(currentFilm);
            }
        }
        return foundFilmsList;
    }

    public List<Film> searchFilmByTitle(String title) {
        List<Film> foundFilmsList = new ArrayList<>();
        for (Film currentFilm : filmStorage.getFilms()) {
            if (currentFilm.getTitle().equals(title)) {
                foundFilmsList.add(currentFilm);
            }
        }
        return foundFilmsList;
    }

    public List<Film> searchFilmByReleaseDate(Date releaseDate) {
        List<Film> foundFilmsList = new ArrayList<>();
        for (Film currentFilm : filmStorage.getFilms()) {
            if (currentFilm.getReleaseDate().equals(releaseDate)) {
                foundFilmsList.add(currentFilm);
            }
        }
        return foundFilmsList;
    }

}
