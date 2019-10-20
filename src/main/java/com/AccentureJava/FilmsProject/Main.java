package com.AccentureJava.FilmsProject;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.signUp("Egor","egorka99","qwerty123");
        user.signIn("egorka99","qwerty123");
        user.signUp("Roma","mazeltov","qwerty123");
        user.signIn("mazeltov","qwerty123");


        Date date = new Date(2019, Calendar.AUGUST,13);
        Film newFilm = new Film("Marvel Avengers","wadq213213",FilmType.FILM,"Action",
                date, 8.1,"Marvel Film");
        Film newFilm2 = new Film("Marvel Avengers: Infinity War","waddq213213",FilmType.FILM,"Action",
                date, 8.1,"Marvel Film");

        FilmStorage filmStorage = new FilmStorage();

        for (Film film: filmStorage.getFilms()) {
            System.out.println(film.getTitle());
        }
    }
}
