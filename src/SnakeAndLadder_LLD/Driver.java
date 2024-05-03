package SnakeAndLadder_LLD;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many dice would you like to play with?");
        int diceValue = sc.nextInt();
        SnakeAndLadder game = new SnakeAndLadder(diceValue);

//      Set board size
        System.out.println("Default board size is 100. Do you wish to change it?\n" + "1. Yes\n" + "2. No\n" + "Enter your choice (Write number only): ");
        if(sc.nextInt() == 1) {
            System.out.println("Enter board size: ");
            int boardSize = sc.nextInt();
            game.setBoardSize(boardSize);
        }

//      Get Snakes
        System.out.println("Enter the number of Snakes: ");
        int noOfSnakes = sc.nextInt();

        List<Snake> snakes = new ArrayList<Snake>();
        int i =0;
        while(i < noOfSnakes) {
            System.out.println("Enter the head & tail of snake");
            int endPosition = sc.nextInt();

            if(endPosition == 100) {
                System.out.println("Snake head cannot be 100");
                break;
            }

            int startPosition = sc.nextInt();

            if(startPosition > endPosition) {
                System.out.println("Error: Cannot set snake as tail of snake is greater than head of snake");
            }else{
                snakes.add(new Snake(startPosition, endPosition));
                i++;
            }
        }

//      Get Ladders
        System.out.println("Enter the number of Ladders: ");
        int noOfLadders = sc.nextInt();

        List<Ladder> ladder = new ArrayList<Ladder>();
        int j=0;
        while(j<noOfLadders) {
            System.out.println("Enter the start & end of ladder");
            int startPosition = sc.nextInt();

            int endPosition = sc.nextInt();

            if(snakes.contains(endPosition) || snakes.contains(startPosition)){
                System.out.println("Error: A snake and ladder cannot have same points");
                break;
            }

            if(endPosition < startPosition) {
                System.out.println("Error: Cannot set ladder as start of ladder is greater than end of ladder");
            }else{
                ladder.add(new Ladder(startPosition, endPosition));
                j++;
            }
        }

//      Get Players
        System.out.println("Enter the number of Players: ");
        int noOfPlayers = sc.nextInt();

        List<Player> players= new ArrayList<Player>();
        for (int k = 0; k < noOfPlayers; k++) {
            players.add(new Player(sc.next()));
        }

//      Set snakes, ladders & players
        game.setSnakes(snakes);
        game.setLadder(ladder);
        game.setPlayers(noOfPlayers, players);

        game.startGame();

    }
}
