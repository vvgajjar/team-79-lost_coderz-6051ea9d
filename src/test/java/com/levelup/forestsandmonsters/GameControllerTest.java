package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
import com.levelup.forestsandmonsters.cli.domain.Character;
import com.levelup.forestsandmonsters.cli.domain.FakeMap;

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
        assertEquals("Character", testObj.status.characterName);
        
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

    @Test
    public void testUPMove(){
        GameController testObj = new GameController();
        testObj.status.character = new Character("John", new FakeMap());
        testObj.move(DIRECTION.NORTH);
        assertEquals(3, testObj.status.currentPosition.x);
        assertEquals(4, testObj.status.currentPosition.y);
    }

    @Test
    public void getGameStatus(){
        GameController testObj = new GameController();
        testObj.status.character = new Character(new FakeMap());
        testObj.status.character.initializeStartingPosition();
        testObj.status.setCurrentPosition();
        testObj.move(DIRECTION.SOUTH);
        testObj.move(DIRECTION.EAST);
        System.out.println("Hey " + testObj.status.characterName + ", you have moved " + testObj.status.moveCount + " times.");
        assertEquals("Hey Character, you have moved 2 times.", testObj.status.toString());
    }
    

}
