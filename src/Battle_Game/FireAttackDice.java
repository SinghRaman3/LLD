package Battle_Game;

import java.util.Random;

public class FireAttackDice implements Dice{
    @Override
    public int rollDice() {
        return new Random().nextInt(1,7);
    }
}
