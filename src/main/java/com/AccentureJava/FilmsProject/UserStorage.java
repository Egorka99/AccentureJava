package com.AccentureJava.FilmsProject;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    private static List<User> listOfUsers = new ArrayList<>();

    public void addNewUser(User user) {
        listOfUsers.add(user);
    }
    public List<User> getUsers() {
        return listOfUsers;
    }



}
