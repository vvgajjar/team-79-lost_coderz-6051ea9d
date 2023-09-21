package com.levelup.forestsandmonsters.cli.domain;

public class Character {

    public static String DEFAULT_NAME = "Lost Coderz";
    private String name;

    public Character(){
        name = DEFAULT_NAME;
    }

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
