package com.AccentureJava.FilmsProject;

import java.util.ArrayList;
import java.util.List;

public class FilmStorage {
    private static List<Film> listOfFilms = new ArrayList<>();

    public void addNewFilm(Film film) {
        listOfFilms.add(film);
    }
    public List<Film> getFilms() {
        return listOfFilms;
    }
}
