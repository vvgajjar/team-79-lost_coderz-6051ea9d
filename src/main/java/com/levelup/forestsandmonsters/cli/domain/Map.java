package com.levelup.forestsandmonsters.cli.domain;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Map {  

  public Map(){
    int xRange = 10;
    int yRange = 10;
  }
    public Position nextPosition(Position currentPosition, DIRECTION move){
        Position newPosition = new Position(currentPosition.getXCoordinates(),currentPosition.getYCoordinates());
        int xPos = currentPosition.getXCoordinates();
        int yPos = currentPosition.getYCoordinates();
        if(move == DIRECTION.NORTH || move == DIRECTION.SOUTH ){
            if(move == DIRECTION.NORTH ){
                if(yPos==0){
                newPosition.setYCoordinates(yPos);
                }else{
                yPos = yPos-1;                    
                newPosition.setYCoordinates(yPos);
                }
            }else{
                if(yPos==9){
                newPosition.setYCoordinates(yPos);
                }else{
                yPos = yPos+1;                    
                newPosition.setYCoordinates(yPos);
                }
            }
        }else{
            {
            if(move == DIRECTION.WEST ){
                if(xPos==0){
                newPosition.setXCoordinates(xPos);
                }else{
                xPos = xPos-1;                    
                newPosition.setXCoordinates(xPos);
                }
            }else{
                if(xPos==9){
                newPosition.setXCoordinates(xPos);
                }else{
                yPos = xPos+1;                    
                newPosition.setXCoordinates(xPos);
                }
        }
    }
        
}
     //System.out.println(xPos);
      //  System.out.println(yPos);
        return newPosition;
   
    }
}
