package com.levelup.forestsandmonsters.cli.domain;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class MapTest {
    @Test
    public void initializeCharacter() {
        Map testObj = new Map();
        assertNotNull(testObj);
    }
}
