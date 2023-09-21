package com.levelup.forestsandmonsters.cli.domain;

import java.awt.Point;;

public class Position {

    private Point location;

    public Position(int xCoordinates, int yCoordinates){
        location = new Point(xCoordinates, yCoordinates);
    }

    public int getXCoordinates(int xCoordinates){
        return location.x;
    }
     public int getYCoordinates(int yCoordinates){
        return location.y;
    }
     
    public void setXCoordinates(int xCoordinates){

    }

     public void setYCoordinates(int yCoordinates){

    }

}
