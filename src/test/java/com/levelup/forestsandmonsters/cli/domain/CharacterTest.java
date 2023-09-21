package com.levelup.forestsandmonsters.cli.domain;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CharacterTest {
    
    @Test
    public void initializeCharacter() {
        Character testObj = new Character();
        assertNotNull(testObj);
    }
}
