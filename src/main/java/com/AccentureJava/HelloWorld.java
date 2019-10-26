package com.AccentureJava;

import com.AccentureJava.FilmsProject.Model.Film;
import com.AccentureJava.FilmsProject.Model.FilmType;
<<<<<<< HEAD
<<<<<<< HEAD
import com.fasterxml.jackson.databind.ObjectMapper;


=======
import org.json.*;

>>>>>>> 1c8a8bfe12b3b3df4c8135e06230806f1f064db0
=======
import org.json.*;

>>>>>>> 1c8a8bfe12b3b3df4c8135e06230806f1f064db0
import java.util.Calendar;
import java.util.Date;

class TestClass {
    private String id;
    private String name;

<<<<<<< HEAD
    public TestClass(String id, String name) {
        this.id = id;
        this.name = name;
    }

<<<<<<< HEAD
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
=======
>>>>>>> 1c8a8bfe12b3b3df4c8135e06230806f1f064db0
=======
>>>>>>> 1c8a8bfe12b3b3df4c8135e06230806f1f064db0
public class HelloWorld
{
    public static void main( String[] args )
    {
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
        Date date = new Date(1989,11,17);
        System.out.println(date);
>>>>>>> 1c8a8bfe12b3b3df4c8135e06230806f1f064db0
=======
        Date date = new Date(1989,11,17);
        System.out.println(date);
>>>>>>> 1c8a8bfe12b3b3df4c8135e06230806f1f064db0
    }
}
