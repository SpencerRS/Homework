package com.gcraven.customadapterdemo;

/**
 * Created by g on 8/16/16.
 */
public class Animal {
    private String name;
    private String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
