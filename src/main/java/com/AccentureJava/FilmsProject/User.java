package com.AccentureJava.FilmsProject;

public class User extends Person {
    private boolean isLogIn;
    private UserStorage userStorage = new UserStorage();;

    public User() {
    }

    private User(String userName, String userLogin, String userPassword) {
        this.name = userName;
        this.login = userLogin;
        this.password = userPassword;
    }

    private boolean isExistLogin(String login){
        for (User user: userStorage.getUsers()) {
            if (user.login.equals(login)){
                return true;
            }
        }
         return false;
    }

    public void signIn(String login, String password) {
         if (isExistLogin(login)) {
             this.login = login;
             this.password = password;

             for(User user: userStorage.getUsers()) {
                 if(user.login.equals(this.login) && user.password.equals(this.password)){
                     this.name = user.name;
                     isLogIn = true;
                     System.out.println("User sign in successfully");
                     return;
                 }
             }
             System.out.println("User sign in failed");
         }
         else {
             System.out.println("User sign in failed");
         }
         //TODO Логгирование или убрать sout
     }

     public void signUp(String userName,String userLogin, String userPassword) {
         if (!isExistLogin(userLogin)) {
             User user = new User(userName,userLogin,userPassword);
             userStorage.addNewUser(user);
             System.out.println("User sign up successfully");
         }
         else {
             System.out.println("User sign up failed");
         }
     }
    @Override
    protected void logOut() {
        super.logOut();
        isLogIn = false;
    }
}
