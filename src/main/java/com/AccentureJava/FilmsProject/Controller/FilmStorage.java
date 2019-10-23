package com.AccentureJava.FilmsProject.Controller;

import com.AccentureJava.FilmsProject.Model.*;

import java.util.ArrayList;
import java.util.List;

public class FilmStorage extends Singleton implements newFilmListener{
    private static List<Film> listOfFilms = new ArrayList<>();

    private boolean isUniqueIdentifier(Film film) {
        for (Film currentFilm : listOfFilms) {
            if ( currentFilm.getImdbIdentifier().equals(film.getImdbIdentifier())) {
                return false;
            }
        }
        return true;
    }

    private FilmStorage() {
        super();
    }

    public void addNewFilm(Film film) {
        if (isUniqueIdentifier(film)) {
            listOfFilms.add(film);
        }
    }

    public List<Film> getFilms() {
        return listOfFilms;
    }

    @Override
    public void newFilmCreated(Film film) {
        listOfFilms.add(film);
    }
}
