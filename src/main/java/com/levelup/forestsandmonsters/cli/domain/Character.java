package com.levelup.forestsandmonsters.cli.domain;

public class Character {

    public static String DEFAULT_NAME = "Lost Coderz";
    private String name;
    private Position currentPosition;

    public Character(){
        name = DEFAULT_NAME;
        currentPosition = new Position(0, 0);
    }

    public Character(String name) {
        this.name = name; 
        currentPosition = new Position(0, 0);
    }
    public Character(String name, Position randomPosition) {
        this.name = name; 
        currentPosition = randomPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return currentPosition;
    }

}
