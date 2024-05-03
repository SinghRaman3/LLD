package SnakeAndLadder_LLD;

import java.util.Random;

public class Dice {
    private int noOfDice;

    Dice(int noOfDice) {
        this.noOfDice = noOfDice;
    }

    int rollDice(){
        return new Random().nextInt(1,7)*noOfDice;
    }
}
