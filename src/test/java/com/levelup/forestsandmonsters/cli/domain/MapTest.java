package com.levelup.forestsandmonsters.cli.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import java.awt.Point;

public class MapTest {

    int startX, startY;

    @Test
    public void initalizeMap() {
        Map testObj = new Map();
        assertNotNull(testObj);
    }

    @Test
    public void initalMapSize() {
        assertEquals(100, Map.numPositions);
    }

   /*@Test
    public void getMapPosition() {
        Map.getMapPosition(new Point(this.startX, this.startY));
    }   */ 

}
