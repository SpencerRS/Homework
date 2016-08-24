package com.gcraven.sqliteopenhelperdemo;

/**
 * Created by g on 8/23/16.
 */
public class Game {

    int id;
    String name;
    String year;

    public Game(int id, String name, String year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
