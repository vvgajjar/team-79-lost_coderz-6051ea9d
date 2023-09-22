package com.levelup.forestsandmonsters.cli.domain;

import java.util.Random;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

    public static String DEFAULT_NAME = "Character";
    private String name;
    private Position currentPosition;
    private Map map;

    public Character(Map map){
        name = DEFAULT_NAME;
        currentPosition = new Position(0, 0);
        this.map = map;
    }

    public Character(String name, Map map) {
        this.name = name; 
        currentPosition = new Position(0, 0);
        this.map = map;
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

    public void initializeStartingPosition(){
        Random rand = new Random();
        int rand_intX = rand.nextInt(10);
        int rand_intY = rand.nextInt(10);

        this.currentPosition = new Position(rand_intX,rand_intY);
    }

    public void move(DIRECTION move){
        map.nextPosition(this.currentPosition, move);        
    }
}
