package com.AccentureJava.FilmsProject.Interfaces;

import com.AccentureJava.FilmsProject.Model.User;

import java.sql.SQLException;

public interface UserOperation {
    public User signIn(String login, String password) throws SQLException, ClassNotFoundException, Exception;
    public boolean signUp(String userName,String userLogin, String userPassword) throws SQLException, ClassNotFoundException;

}
