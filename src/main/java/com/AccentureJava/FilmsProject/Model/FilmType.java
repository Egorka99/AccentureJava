package com.AccentureJava.FilmsProject.Model;

import java.io.Serializable;

public enum FilmType implements Serializable {
    FILM,SERIES,CARTOON;

    public String getStatus() {
        return this.name();
    }
}
