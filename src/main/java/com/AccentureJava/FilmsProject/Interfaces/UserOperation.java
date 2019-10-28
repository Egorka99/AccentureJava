package com.AccentureJava.FilmsProject.Interfaces;

import com.AccentureJava.FilmsProject.Model.User;

public interface UserOperation {
    public User signIn(String login, String password) throws Exception;
    public boolean signUp(String userName,String userLogin, String userPassword);

}
