package com.AccentureJava.FilmsProject;

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
    private FilmStorage filmStorage = new FilmStorage();

    public Film(String title, String imdbIdentifier, FilmType filmType, String genre, Date releaseDate, double rating, String description) {
        this.title = title;
        if (!isUniqueIdentifier(imdbIdentifier)) {
            throw new IllegalArgumentException("Imdb идентификатор должен быть уникальным");
        }
        this.imdbIdentifier = imdbIdentifier;
        this.filmType = filmType;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.description = description;

        filmStorage.addNewFilm(this);
    }

    private boolean isUniqueIdentifier(String imdbIdentifier) {
        for (Film film: filmStorage.getFilms()) {
            if (film.imdbIdentifier.equals(imdbIdentifier)) {
                return false;
            }
        }
        return true;
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

    public List<Review> getReview() {
        return reviewList;
    }
}
