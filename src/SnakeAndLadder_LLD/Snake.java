package SnakeAndLadder_LLD;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Snake implements Jumper{
    private Map<Integer, Integer> SnakePositions= new HashMap<Integer, Integer>();

    int start;
    int end;


    public Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int getStart(){
        return start;
    }

    @Override
    public int getEnd(){
        return end;
    }

    public Map<Integer, Integer> getSnakePositions(){
        return SnakePositions;
    }
}
