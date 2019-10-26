package com.AccentureJava;

import com.AccentureJava.FilmsProject.Model.Film;
import com.AccentureJava.FilmsProject.Model.FilmType;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Calendar;
import java.util.Date;

class TestClass {
    private String id;
    private String name;

    public TestClass(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class HelloWorld
{
    public static void main( String[] args )
    {

        String jsonString = "{\"id\":\"N42\",\"name\":\"roman\"}";
        ObjectMapper mapper = new ObjectMapper();

        TestClass[] filmsJSON = new TestClass[10];
        try {
             filmsJSON = mapper.readValue(jsonString, TestClass[].class);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (TestClass film:filmsJSON) {
            System.out.println(film.getId());
        }



    }
}
