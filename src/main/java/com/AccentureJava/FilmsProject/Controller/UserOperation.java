package com.AccentureJava.FilmsProject.Controller;

import com.AccentureJava.FilmsProject.Model.User;

public class UserOperation {

    private UserStorage userStorage = UserStorage.getInstance();

    private boolean isExistLogin(String login){
        return userStorage.getUserData().containsKey(login);
    }

    public User signIn(String login, String password) throws Exception {
        if (isExistLogin(login)) {

            for (User user: userStorage.getUsers()) {
                if (user.getLogin().equals(login) && user.getPassword().equals(password)){
                   return new User(user.getName(),login,password);
                }
            }
        }
        throw new Exception("Неверные данные для авторизации");
    }

    public boolean signUp(String userName,String userLogin, String userPassword) {
        if (!isExistLogin(userLogin)) {
            User user = new User(userName,userLogin,userPassword);
            userStorage.addNewUser(user);
            return true;
        }
        return false;
    }




}
