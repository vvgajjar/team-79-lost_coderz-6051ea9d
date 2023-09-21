package com.levelup.forestsandmonsters.cli.domain;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class FakeMap extends Map {
    public FakeMap(){
        super();
    }

    @Override
    public Position nextPosition(Position currrentPosition, DIRECTION move){
        if(move.equals(DIRECTION.EAST)){
            return new Position(1, 1);
        } else if(move.equals(DIRECTION.WEST)){
            return new Position(2, 2);
        }if(move.equals(DIRECTION.NORTH)){
            return new Position(3, 3);
        }else 
            return new Position(4, 4);
        
    }

}
