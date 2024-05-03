package SnakeAndLadder_LLD;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<String, Integer> playersSetup = new HashMap<String, Integer>();
    private int size = 100;
    private List<Snake> snakesPosition;
    private List<Ladder> ladderPosition;

    public Board() {
        this.snakesPosition  = new ArrayList<>();
        this.ladderPosition = new ArrayList<>();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void placeSnakesOnBoard(List<Snake> snakes){
        this.snakesPosition = snakes;
    }

    public void placeLaddersOnBoard(List<Ladder> ladders){
        this.ladderPosition = ladders;
    }

    public void placePlayersOnBoard(String playerName, int newPosition){
        playersSetup.put(playerName, newPosition);
    }

    int checkSnakeOrLadder(Player player, int initialValue, int newValue){
        for (Snake snake : snakesPosition){
            if(snake.end == initialValue + newValue){
                newValue = snake.start;
            }
        }
        for (Ladder ladder : ladderPosition){
            if(ladder.start == initialValue + newValue){
                newValue = ladder.end;
            }
        }

        return newValue;
    }

    public Map<String, Integer> getCurrentBoard() {
        return playersSetup;
    }
}
