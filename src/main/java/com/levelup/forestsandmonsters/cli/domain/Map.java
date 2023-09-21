package com.levelup.forestsandmonsters.cli.domain;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Map {  

  public Map(){
    int xRange = 10;
    int yRange = 10;
  }
    public Position nextPosition(Position currentPosition, DIRECTION move){
        int xPos = currentPosition.getXCoordinates();
        int yPos = currentPosition.getYCoordinates();
        int checkX=0;
        int checkY=0;
        Position newPosition = new Position(checkX, checkY);
        if(move == DIRECTION.NORTH || move == DIRECTION.SOUTH ){
            if(move == DIRECTION.NORTH ){
                checkY = yPos-1;
            }else{
                checkY = yPos+1;
            }
        }else{
            {
            if(move == DIRECTION.EAST ){
                checkX = xPos+1;
            }else{
                checkX = xPos-1;
            }
        }
        }
        int newX= newPosition.setXCoordinates(checkX);
        int newY =newPosition.setYCoordinates(checkY);

        return nextPosition(newPosition, move);
    }

}
