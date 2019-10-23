package com.AccentureJava.FilmsProject.Controller;

import com.AccentureJava.FilmsProject.Model.*;

import java.util.ArrayList;
import java.util.List;

public class FilmStorage implements newFilmListener{
    private static List<Film> listOfFilms = new ArrayList<>();

    public void addNewFilm(Film film) {
        listOfFilms.add(film);
    }

    public List<Film> getFilms() {
        return listOfFilms;
    }

    @Override
    public void newFilmCreated(Film film) {
        listOfFilms.add(film);
    }
}
