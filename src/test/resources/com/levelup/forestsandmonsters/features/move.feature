Feature: Move in a direction 
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player chooses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 0 | 0 | NORTH | 10 | 0 | 0 | 11 |
            | 0 | 0 | SOUTH | 32 | 0 | 1 | 33 |
            | 0 | 0 | EAST  | 32 | 1 | 0 | 33 |
            | 0 | 0 | WEST  | 32 | 0 | 0 | 33 |
            | 9 | 9 | NORTH | 10 | 9 | 8 | 11 |
            | 9 | 9 | SOUTH | 32 | 9 | 9 | 33 |
            | 9 | 9 | EAST  | 32 | 9 | 9 | 33 |
            | 0 | 9 | WEST  | 32 | 0 | 9 | 33 |
            | 0 | 9 | NORTH | 10 | 0 | 8 | 11 |
            | 0 | 9 | SOUTH | 32 | 0 | 9 | 33 |
            | 0 | 9 | EAST  | 32 | 1 | 9 | 33 |
            | 9 | 0 | WEST  | 32 | 8 | 0 | 33 |
            | 9 | 0 | NORTH | 10 | 9 | 0 | 11 |
            | 9 | 0 | SOUTH | 32 | 9 | 1 | 33 |
            | 9 | 0 | EAST  | 32 | 9 | 0 | 33 |
            | 4 | 4 | WEST  | 32 | 3 | 4 | 33 |
            | 4 | 4 | NORTH | 10 | 4 | 3 | 11 |
            | 4 | 4 | SOUTH | 32 | 4 | 5 | 33 |
            | 4 | 4 | EAST  | 32 | 5 | 4 | 33 |