package SnakeAndLadder_LLD;

import java.util.HashMap;
import java.util.Map;

public class Ladder implements Jumper{
    private Map<Integer, Integer> LadderPositions= new HashMap<Integer, Integer>();
    int start, end;

    public Ladder(int start, int end){
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

    public Map<Integer, Integer> getLadderPositions(){
        return LadderPositions;
    }
}
