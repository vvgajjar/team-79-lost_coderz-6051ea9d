package com.levelup.forestsandmonsters.cli.domain;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class CharacterTest {
    
    @Test
    public void initializeCharacter() {
        Character testObj = new Character();
        assertNotNull(testObj);
    }

    @Test
    public void testDefaultCharacterName(){
        Character testObj = new Character();
        String defaultName = testObj.getName();
        assertEquals("Lost Coderz", defaultName);
    }
}
