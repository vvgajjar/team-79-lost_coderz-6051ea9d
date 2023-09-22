package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.cli.domain.Character;
import com.levelup.forestsandmonsters.cli.domain.Map;
import com.levelup.forestsandmonsters.cli.domain.Position;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";

    public class GameStatus {
        // TODO: Add other status data
        public Character character = null;
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
        public int moveCount = 0;

        public void setCurrentPosition(int x, int y){
            this.currentPosition = new Point(x, y);
        }
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.character = new Character(name, new Map());
        } else {
            status.character = new Character(new Map());
        }
        status.characterName = status.character.getName();
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        status.character.move(directionToMove);
        status.setCurrentPosition(status.character.getPosition().getXCoordinates(), status.character.getPosition().getYCoordinates());
        // TODO: Should probably also update the game results
    }

    public void setCharacterPosition(Point coordinates) {
        status.character.getPosition().setXCoordinates(coordinates.x);
        status.character.getPosition().setYCoordinates(coordinates.y);
        status.setCurrentPosition(status.character.getPosition().getXCoordinates(), status.character.getPosition().getYCoordinates());
    }

    public void setCurrentMoveCount(int moveCount) {
        // IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
        status.moveCount = moveCount;
    }

    public int getTotalPositions() {
        // IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        return 100;
    }

}
