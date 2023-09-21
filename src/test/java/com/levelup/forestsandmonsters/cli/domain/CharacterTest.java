package com.levelup.forestsandmonsters.cli.domain;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacterTest {
    
    @Test
    public void initializeCharacter() {
        Character testObj = new Character(new FakeMap());
        assertNotNull(testObj);
    }

    @Test
    public void testDefaultCharacterName(){
        Character testObj = new Character(new FakeMap());
        String defaultName = testObj.getName();
        assertEquals("Lost Coderz", defaultName);
    }

    @Test
    public void testCharacterName(){
        Character testObj = new Character("John Doe", new FakeMap());
        String actualName = testObj.getName();
        assertEquals("John Doe", actualName);
    }

     @Test
    public void testDefatultStartingPosition(){
        Character testObject = new Character("John Doe", new FakeMap());
        int expectedX = 0;
        int expectedY = 0;
        Position initialPosition = testObject.getPosition();
        
        assertEquals(expectedX, initialPosition.getXCoordinates());
        assertEquals(expectedY, initialPosition.getYCoordinates());
    }

    @Test
    public void testInitializeDefaultStartingPosition(){
        int expectedX = 5;
        int expectedY = 4;
        Character testObject = new Character("John Doe", new Position(5, 4));
        
        Position initialPosition = testObject.getPosition();
        
        assertEquals(expectedX, initialPosition.getXCoordinates());
        assertEquals(expectedY, initialPosition.getYCoordinates());
    }

    @Test
    public void testInitializeRandomStartingPosition(){
        Character testObject = new Character("John Doe", new FakeMap());

        testObject.initializeStartingPosition();
        Position initialPosition;
        
        for(int i=0; i<10; i++){
            initialPosition = testObject.getPosition();

            assertTrue(initialPosition.getXCoordinates() >=0 );
            assertTrue(initialPosition.getXCoordinates() < 10 );
            assertTrue(initialPosition.getYCoordinates() >=0 );
            assertTrue(initialPosition.getYCoordinates() < 10 );
        }
    }

}
