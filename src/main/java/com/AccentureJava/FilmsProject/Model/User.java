package com.AccentureJava.FilmsProject.Model;

import com.AccentureJava.FilmsProject.Model.Person;

public class User extends Person {


    public User(String userName, String userLogin, String userPassword) {
        this.name = userName;
        this.login = userLogin;
        this.password = userPassword;
    }




//    public void signIn(String login, String password) {
//         if (isExistLogin(login)) {
//             this.login = login;
//             this.password = password;
//
//             for(User user: userStorage.getUsers()) {
//                 if(user.login.equals(this.login) && user.password.equals(this.password)){
//                     this.name = user.name;
//                     System.out.println("User sign in successfully");
//                     return;
//                 }
//             }
//             System.out.println("User sign in failed");
//
//         }
//         else {
//             System.out.println("User sign in failed");
//         }
//
//     }
//
//    public void signUp(String userName,String userLogin, String userPassword) {
//         if (!isExistLogin(userLogin)) {
//             User user = new User(userName,userLogin,userPassword);
//             userStorage.addNewUser(user);
//             System.out.println("User sign up successfully");
//         }
//         else {
//             System.out.println("User sign up failed");
//         }
//    }

//    public void writeReview(String imdbIdentifier, String reviewText, double rating) {
//        Date currentDate = new Date();
//        Review review = new Review(currentDate,this,reviewText,rating);
//
//        for (Film currentFilm: filmStorage.getFilms()) {
//            if (currentFilm.getImdbIdentifier().equals(imdbIdentifier)) {
//                currentFilm.reviewList.add(review);
//            }
//        }
//    }
//
//    public List<Film> searchFilmByIdentifier(String imdbIdentifier) {
//        List<Film> foundFilmsList = new ArrayList<>();
//        for (Film currentFilm : filmStorage.getFilms()) {
//            if (currentFilm.getImdbIdentifier().equals(imdbIdentifier)) {
//                foundFilmsList.add(currentFilm);
//            }
//        }
//        return foundFilmsList;
//    }
//
//    public List<Film> searchFilmByTitle(String title) {
//        List<Film> foundFilmsList = new ArrayList<>();
//        for (Film currentFilm : filmStorage.getFilms()) {
//            if (currentFilm.getTitle().equals(title)) {
//                foundFilmsList.add(currentFilm);
//            }
//        }
//        return foundFilmsList;
//    }
//
//    public List<Film> searchFilmByReleaseDate(Date releaseDate) {
//        List<Film> foundFilmsList = new ArrayList<>();
//        for (Film currentFilm : filmStorage.getFilms()) {
//            if (currentFilm.getReleaseDate().equals(releaseDate)) {
//                foundFilmsList.add(currentFilm);
//            }
//        }
//        return foundFilmsList;
//    }

}
