package com.AccentureJava.FilmsProject.Controller;

import com.AccentureJava.FilmsProject.Model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
<<<<<<< HEAD
<<<<<<< HEAD
import com.fasterxml.jackson.databind.*;
=======
>>>>>>> 1c8a8bfe12b3b3df4c8135e06230806f1f064db0
=======
>>>>>>> 1c8a8bfe12b3b3df4c8135e06230806f1f064db0

public class FilmStorage {

    private static List<Film> listOfFilms = new ArrayList<>();

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

//    public boolean addFilmsFromJSON(String response) {
//    }

    public List<Film> getSortFilms() {
        Collections.sort(listOfFilms,new FilmRatingComparator());
        return listOfFilms;
    }

    public List<Film> getFilms() {
        return listOfFilms;
    }

}
