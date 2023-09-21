package com.levelup.forestsandmonsters.cli.domain;

import java.awt.Point;;

public class Position {

    private Point location;

    public Position(int xCoordinates, int yCoordinates){
        location = new Point(xCoordinates, yCoordinates);
    }

    public int getXCoordinates(){
        return location.x;
    }
     public int getYCoordinates(){
        return location.y;
    }
     
    public int setXCoordinates(int xCoordinates){
        return xCoordinates;
    }

     public int setYCoordinates(int yCoordinates){
        return yCoordinates;
    }

}
