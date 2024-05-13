package Battle_Game;

import java.util.*;

public class BattleArena implements Arena{
    Queue<Player> players;

    BattleArena(){
        this.players = new LinkedList<>();
    }

    public void setPlayers(List<Player> players){

        this.players.addAll(players);
    }

    private int getDiceValue(String diceType){
        if(diceType.equals("Fire")){
            Dice fireDice = new FireAttackDice();
            return fireDice.rollDice();
        }
        else if(diceType.equals("Water")){
            Dice waterDice = new WaterDefenceDice();
            return waterDice.rollDice();
        }
        return 0;
    }

    private int calcFireAttackValue(Player player){
        return getDiceValue("Fire") * player.getFireAttack();
    }

    public int calcWaterDefenceValue(Player player){
        return getDiceValue("Water") * player.getStrength();
    }

    private Boolean isPlayerDefeated(Player player){
        return player.getHealth() <= 0;
    }

    private Boolean isGameCompleted(){
        return players.size() == 1;
    }

    @Override
    public void startKickoff(){
        while(!isGameCompleted()){
            Player attackingPlayer = players.poll();
            Player defendingPlayer = players.peek();

            int attackValue = calcFireAttackValue(attackingPlayer);
            int defenceValue = calcWaterDefenceValue(defendingPlayer);
            int damage = attackValue - defenceValue;


            if(attackValue > defenceValue){
                defendingPlayer.setHealth((defendingPlayer.getHealth() - damage));
            }

            System.out.println(attackingPlayer.getName() + " attacked: " + attackValue);
            System.out.println(defendingPlayer.getName() + " defended: " + defenceValue);
            System.out.println(defendingPlayer.getName() + " now has " + defendingPlayer.getHealth() + " amount of health left");

            if(isPlayerDefeated(defendingPlayer)){
                System.out.println(defendingPlayer.getName() + " is defeated");
            }
            else players.add(attackingPlayer);
        }
        System.out.println("Congratulations! " + players.poll() + " players has won" );
    }
}
