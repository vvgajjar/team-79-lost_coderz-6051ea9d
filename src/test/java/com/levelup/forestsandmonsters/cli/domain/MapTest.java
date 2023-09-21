package com.levelup.forestsandmonsters.cli.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

import java.awt.Point;

public class MapTest {

    @Test
    public void initalizeMap() {
        Map testObj = new Map();
        assertNotNull(testObj);
    }

    @Test
    public void testNewPosition(){
        Map testObj = new Map();
        Position currPosition = new Position(10,15);
        testObj.nextPosition(currPosition, DIRECTION.NORTH);
    
    }

   /*@Test
    public void getMapPosition() {
        Map.getMapPosition(new Point(this.startX, this.startY));
    }   */ 

}
