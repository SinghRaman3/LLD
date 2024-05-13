package Battle_Game_LLD;

import java.util.Random;

public class WaterDefenceDice implements Dice{
    @Override
    public int rollDice() {
        return new Random().nextInt(1,7);
    }
}
