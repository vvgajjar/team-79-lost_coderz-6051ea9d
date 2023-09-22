package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class GameControllerTest {
    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void testCreateDefaultCharacter() {
        GameController testObj = new GameController();
        testObj.createCharacter(null);
        assertEquals("Lost Coderz", testObj.status.characterName);
        
    }

    @Test
    public void testCreateCharacter() {
        GameController testObj = new GameController();
        testObj.createCharacter("Jane Smith");
        assertEquals("Jane Smith", testObj.status.characterName);
        
    }

    @Test
    public void testInitialMoveCount() {
        GameController testObj = new GameController();
        assertEquals(0, testObj.status.moveCount);
        
    }

    

}
