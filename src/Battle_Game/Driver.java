package Battle_Game;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BattleArena arena = new BattleArena();
        List<Player> players = new ArrayList<Player>();

        System.out.println("Enter no of players: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter player " + (i+1) + " name: ");
            String name = sc.next();
            System.out.println("Enter player " + (i+1) + " health: ");
            int health = sc.nextInt();
            System.out.println("Enter player " + (i+1) + " strength: ");
            int strength = sc.nextInt();
            System.out.println("Enter player " + (i+1) + " fire attack: ");
            int fireAttack = sc.nextInt();

            players.add(new Player(name, health, strength, fireAttack));

        }

        arena.setPlayers(players);
        arena.startKickoff();
    }
}
