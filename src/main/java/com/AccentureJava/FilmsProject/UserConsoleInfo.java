package com.AccentureJava.FilmsProject;

import java.util.List;


public class UserConsoleInfo extends User {

    public void getInfo(Film film){
        System.out.printf("---Фильм № %s--- \n" +
                "Название: %s \n" +
                "Тип фильма: %s \n" +
                "Жанр фильма: %s \n" +
                "Дата выхода: %s \n" +
                "Оценка: %s \n" +
                "Описание фильма: \n" +
                "%s \n"
                ,film.getImdbIdentifier(),film.getTitle(),film.getFilmType(),film.getGenre(),film.getReleaseDate(),
                film.getRating(),film.getDescription());
    }

    public void getSearchResult(List<Film> foundFilms) {
        System.out.println("Найденные фильмы: ");
            for (Film foundFilm: foundFilms) {
                getInfo(foundFilm);
                System.out.println();
            }
    }


}
