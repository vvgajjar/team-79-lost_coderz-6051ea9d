package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.cli.domain.Character;
import com.levelup.forestsandmonsters.cli.domain.Map;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";

    public class GameStatus {
        // TODO: Add other status data
        public Character character = new Character(DEFAULT_CHARACTER_NAME, new Map());
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = new Point(character.getPosition().getXCoordinates(), character.getPosition().getYCoordinates());
        public int moveCount = 0;

        public void setCurrentPosition(){
            this.currentPosition = new Point(character.getPosition().getXCoordinates(), character.getPosition().getYCoordinates());
        }

        public String toString(){
            return "Hey " + characterName +", your move " + moveCount + " was to position (x, y): (" + currentPosition.x + ", " + currentPosition.y + ")";    
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
        // Implement move - should call something on another class
        status.character.move(directionToMove);
        status.setCurrentPosition();
        // Should probably also update the game results
        status.moveCount++;
    }

    public void createNewStatus(){
        GameStatus newStatus = new GameStatus();
        newStatus.characterName = this.status.characterName;
        newStatus.currentPosition = this.status.currentPosition;
        newStatus.character = this.status.character;
        newStatus.moveCount = status.moveCount;
        this.status = newStatus;
    }

    public void setCharacterPosition(Point coordinates) {
        status.character.getPosition().setXCoordinates(coordinates.x);
        status.character.getPosition().setYCoordinates(coordinates.y);
        status.setCurrentPosition();
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
