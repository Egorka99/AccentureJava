package com.AccentureJava.FilmsProject;

public abstract class Person {
    protected String name;
    protected String login;
    protected String password;

    protected void logOut() {
        name = null;
        login = null;
        password = null;
    }


}
