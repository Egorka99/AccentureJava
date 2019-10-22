package com.AccentureJava.FilmsProject;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void userTest() {
        User user = new User();
        user.signUp("Egor","egorka99","qwerty123");
        user.signIn("egorka99","qwerty123");

        user.signUp("Ivan","egorka99","qwerty123"); //failed, the same login
    }

    public static void filmStorageTest() {
        Date date = new Date(2019, Calendar.AUGUST,13);

        Film newFilm = new Film("Marvel Avengers","wadq213213",FilmType.FILM,"Action",
                date, 8.1,"Marvel Film");
        Film newFilm2 = new Film("Marvel Avengers: Infinity War","waddq213213",FilmType.FILM,"Action",
                date, 8.1,"Marvel Film");

        FilmStorage filmStorage = new FilmStorage();

        System.out.println("Все фильмы: ");
        for (Film film: filmStorage.getFilms()) {
            System.out.println(film.getTitle());
        }
    }
    public static void searchFilmTest() {
        UserConsoleInfo user = new UserConsoleInfo();

        Date date1 = new Date(2019, Calendar.AUGUST,13);
        Date date2 = new Date(2019, Calendar.OCTOBER,22);

        Film newFilm = new Film("Marvel Avengers","wadq213213",FilmType.FILM,"Action",
                date1, 8.1,"Marvel Film");
        Film newFilm2 = new Film("Games Of Thrones","43242213213",FilmType.SERIES,"Series",
                date2, 7.1,"Game of Thrones is an American fantasy drama television series created by " +
                "David Benioff and D. B. Weiss for HBO. It is an adaptation of A Song of Ice and Fire, George R. R. ... " +
                "The series premiered on HBO in the United States on April 17, 2011, and concluded on May 19, 2019, with " +
                "73 episodes broadcast over eight seasons.");
        Film newFilm3 = new Film("Woody Woodpecker","435345433",FilmType.CARTOON,"Comedy",
                date2, 9.1,"Woody Woodpecker is an animated cartoon character, an anthropomorphic" +
                " red-headed woodpecker who appeared in theatrical short films produced by the Walter Lantz animation" +
                " studio and distributed by Universal Studios.");

        user.signUp("Egor","egorka99","qwerty123");
        user.signIn("egorka99","qwerty123");
        System.out.println();
        System.out.println("Поиск фильма по дате 22.10.2019");
        System.out.println();

//        user.getSearchResult(user.searchFilmByTitle("Marvel Avengers"));
//        user.getSearchResult(user.searchFilmByIdentifier("43242213213"));
//        user.getSearchResult(user.searchFilmByIdentifier("4324"));
          user.getSearchResult(user.searchFilmByReleaseDate(date2));
    }

    public static void reviewTest() {
        User user = new User();

        Date date1 = new Date(2019, Calendar.AUGUST,13);
        Film newFilm = new Film("Marvel Avengers","213213",FilmType.FILM,"Action",
                date1, 8.1,"Marvel Film");

        user.signUp("Egor","egorka99","qwerty123");
        user.signIn("egorka99","qwerty123");

        user.writeReview("213213","bla bla",8.1);
        user.writeReview("213213","bla bla bla",8.4);

        System.out.println("ID всех отзывов фильма: ");
        for (Film film : user.searchFilmByIdentifier("213213")) {
           for (Review rw:film.reviewList) {
               System.out.println(rw.getReviewId());
           }
        }

        System.out.println("---");
        Admin admin = new Admin();

        admin.deleteReview("213213",1);

        System.out.println("Удаляем отзыв с ID 1...");
        System.out.println("ID всех отзывов фильма: ");
        for (Film film : user.searchFilmByIdentifier("213213")) {
            for (Review rw:film.reviewList) {
                System.out.println(rw.getReviewId());
            }
        }
        System.out.println("---");

        Review review = new Review(date1,admin,"bla bla bla",8.1);
        admin.updateReview("213213",2, review);

        System.out.println("Изменяем отзыв с ID 2 на отзыв с ID 3");
        System.out.println("ID всех отзывов фильма: ");
        for (Film film : user.searchFilmByIdentifier("213213")) {
            for (Review rw:film.reviewList) {
                System.out.println(rw.getReviewId());
            } 
        }

    }
    public static void main(String[] args) {
      // userTest();
      // filmStorageTest();
      //  searchFilmTest();
        reviewTest();
    }
}
