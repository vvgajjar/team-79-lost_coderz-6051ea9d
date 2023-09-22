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
        Position currPosition = new Position(5,5);
        assertNotNull(currPosition);
    
    }
    @Test
    public void checkWest() {
        Map testObj = new Map();
        Position currPosition = new Position(0,5);
        testObj.nextPosition(currPosition, DIRECTION.WEST);
        System.out.println("This is the position" + " "+ currPosition);
        assertEquals(0, currPosition.getXCoordinates());
    }

     @Test
    public void checkEast() {
        Map testObj = new Map();
        Position currPosition = new Position(9,5);
        testObj.nextPosition(currPosition, DIRECTION.EAST);
        System.out.println("This is the position" + " "+ currPosition);
        assertEquals(9, currPosition.getXCoordinates());
    }
       @Test
    public void checkNorth() {
        Map testObj = new Map();
        Position currPosition = new Position(5,0);
        testObj.nextPosition(currPosition, DIRECTION.NORTH);
        System.out.println("This is the position" + " "+ currPosition);
        assertEquals(0, currPosition.getYCoordinates());
    }
    @Test
 public void checkSouth() {
        Map testObj = new Map();
        Position currPosition = new Position(5,9);
        testObj.nextPosition(currPosition, DIRECTION.SOUTH);
        System.out.println("This is the position" + " "+ currPosition);
        assertEquals(9, currPosition.getYCoordinates());
    }

}
