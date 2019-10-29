package com.AccentureJava.FilmsProject.Database;

import com.AccentureJava.FilmsProject.Interfaces.FilmOperation;
import com.AccentureJava.FilmsProject.Interfaces.TableOperation;
import com.AccentureJava.FilmsProject.Model.Admin;
import com.AccentureJava.FilmsProject.Model.Film;
import com.AccentureJava.FilmsProject.Model.User;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class FilmTable extends BaseTable implements TableOperation, FilmOperation {

    public FilmTable() {
        super("Film");
    }

    public boolean createTable() throws SQLException, ClassNotFoundException {
        return execute("CREATE TABLE IF NOT EXISTS Film(\n" +
            "                IMDBidentifier VARCHAR(20) PRIMARY KEY, \n" +
            "                title VARCHAR(50) NOT NULL, \n" +
            "                filmtype INTEGER NOT NULL,\n" +
            "                genre VARCHAR(20) NOT NULL,\n" +
            "                releasedate DATE NOT NULL,\n" +
            "                rating DOUBLE NOT NULL,\n" +
            "                description VARCHAR(1000) NOT NULL)");
    }

    public void addTestData() throws SQLException, ClassNotFoundException {
        execute("INSERT INTO Film VALUES ('326', 'The Shawshank Redemption', 0, 'Drama', '1994-10-03', 8.9, 'description');");
        execute("INSERT INTO Film VALUES ('258687', 'Interstellar', 0,'Fantastic', '2014-10-03', 8.6, 'description');");
        execute("INSERT INTO Film VALUES ('464963', 'Game of Thrones', 1,'Fantasy', '2011-10-03', 9.4, 'description');");
        execute("INSERT INTO Film VALUES ('502838', 'Sherlock', 1,'Detective', '2012-10-03', 9.1, 'description');");
        execute("INSERT INTO Film VALUES ('77164', 'The Simpsons', 2,'Comedy', '1999-10-03', 8.7, 'description');");
        execute("INSERT INTO Film VALUES ('46483', 'Nu, pogodi!', 2,'Comedy', '1965-10-03', 8.6, 'description');");
    }

    @Override
    public boolean addReview(String imdbIdentifier, User user, String reviewText, double rating) {
        return false;
    }

    @Override
    public boolean updateReview(String imdbIdentifier, Admin author, int oldReviewId, String reviewText, double rating) {
        return false;
    }

    @Override
    public boolean deleteReview(String imdbIdentifier, Admin author, int reviewId) {
        return false;
    }

    @Override
    public List<Film> searchFilmByIdentifier(String imdbIdentifier) {
        return null;
    }

    @Override
    public List<Film> searchFilmByTitle(String title) {
        return null;
    }

    @Override
    public List<Film> searchFilmByReleaseDate(Date releaseDate) {
        return null;
    }
}
