package Battle_Game;

public class Player {
    private String name;
    private int health, strength, fireAttack;

    Player(String name, int health, int strength, int fireAttack){
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.fireAttack = fireAttack;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getFireAttack() {
        return fireAttack;
    }

    public void setFireAttack(int fireAttack) {
        this.fireAttack = fireAttack;
    }
}
