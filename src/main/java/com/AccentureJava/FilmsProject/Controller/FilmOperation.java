package com.AccentureJava.FilmsProject.Controller;

import com.AccentureJava.FilmsProject.Model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilmOperation {

    private static FilmStorage filmStorage = FilmStorage.getInstance();

    public static boolean addReview(String imdbIdentifier, User user, String reviewText, double rating) {
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

    public static boolean updateReview(String imdbIdentifier, Admin author, int oldReviewId, String reviewText, double rating) {
        Date currentDate = new Date();
        Review review = new Review(currentDate,author,reviewText,rating);

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

    public static boolean deleteReview(String imdbIdentifier, Admin author, int reviewId) {

        if (author != null) {
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

    public static List<Film> searchFilmByIdentifier(String imdbIdentifier) {
        List<Film> foundFilmsList = new ArrayList<>();
        for (Film currentFilm : filmStorage.getSortFilms()) {
            if (currentFilm.getImdbIdentifier().contains(imdbIdentifier)) {
                foundFilmsList.add(currentFilm);
            }
        }
        return foundFilmsList;
    }

    public static List<Film> searchFilmByTitle(String title) {
        List<Film> foundFilmsList = new ArrayList<>();
        for (Film currentFilm : filmStorage.getSortFilms()) {
            if (currentFilm.getTitle().contains(title)) {
                foundFilmsList.add(currentFilm);
            }
        }
        return foundFilmsList;
    }

    public static List<Film> searchFilmByReleaseDate(Date releaseDate) {
        List<Film> foundFilmsList = new ArrayList<>();
        for (Film currentFilm : filmStorage.getSortFilms()) {
            if (currentFilm.getReleaseDate().equals(releaseDate)) {
                foundFilmsList.add(currentFilm);
            }
        }
        return foundFilmsList;
    }

}
