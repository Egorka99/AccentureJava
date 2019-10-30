package com.AccentureJava.FilmsProject.Database;

import com.AccentureJava.FilmsProject.Interfaces.TableOperation;
import com.AccentureJava.FilmsProject.Interfaces.UserOperation;
import com.AccentureJava.FilmsProject.Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserTable extends BaseTable implements TableOperation, UserOperation {


    public UserTable() {
        super("User");
    }

    @Override
    public boolean createTable() throws SQLException, ClassNotFoundException {
        return execute("CREATE TABLE IF NOT EXISTS User(\n" +
                "                login VARCHAR(20) PRIMARY KEY, \n" +
                "                name VARCHAR(20) NOT NULL, \n" +
                "                password VARCHAR(20) NOT NULL)");
    }

    @Override
    public User signIn(String login, String password) throws Exception {
        ResultSet queryResult = executeQuery("SELECT * FROM User WHERE login = '"+login+"' AND password = '"+password+"';");
        if (queryResult.next()) {
            return new User(queryResult.getString("name"),login,password);
        }
        throw new Exception("Неверные данные для авторизации");
    }

    @Override
    public boolean signUp(String userName, String userLogin, String userPassword) throws SQLException, ClassNotFoundException {
        ResultSet queryResult = executeQuery("SELECT * FROM User WHERE login = '"+userLogin+"';");
        if (queryResult.next()) {
            return false;
        }
        else {
            execute("INSERT INTO User VALUES ('"+userLogin+"','"+userName+"','"+userPassword+"');");
            return true;
        }
    }
}
