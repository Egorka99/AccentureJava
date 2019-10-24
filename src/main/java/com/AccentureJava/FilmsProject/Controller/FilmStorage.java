package com.AccentureJava.FilmsProject.Controller;

import com.AccentureJava.FilmsProject.Model.*;

import java.util.TreeSet;

public class FilmStorage {

    private static TreeSet<Film> listOfFilms = new TreeSet<>(new FilmRatingComparator());

    private static FilmStorage instance;

    private FilmStorage(){
    }

    public static FilmStorage getInstance() {
        if (instance == null)
            instance = new FilmStorage();
        return instance;
    }

    private boolean isUniqueIdentifier(Film film) {
        for (Film currentFilm : listOfFilms) {
            if ( currentFilm.getImdbIdentifier().equals(film.getImdbIdentifier())) {
                return false;
            }
        }
        return true;
    }

    public boolean addNewFilm(Film film) {
        if (isUniqueIdentifier(film)) {
            listOfFilms.add(film);
            return true;
        }
        return false;
    }

    public TreeSet<Film> getFilms() {
        return listOfFilms;
    }

}
