package com.levelup.forestsandmonsters.cli.domain;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import java.awt.Point;

public class PositionTest {
    int xCoordinates,yCoordinates;

    @Test
    public void initalizePosition() {
        Position testObj = new Position(xCoordinates,yCoordinates);
        assertNotNull(testObj);
        
    }
    @Test
    public void testXPosition(){
        xCoordinates = 10;
        Position testObj = new Position(xCoordinates, yCoordinates);
        assertEquals(10, testObj.getXCoordinates());

    }


}
