package SnakeAndLadder_LLD;

import java.util.*;

public class SnakeAndLadder {
    private Board board;

    Queue<Player> playerList;
    private int initialNoOfPlayers;

    private Dice dice;
    private int diceValue;
    private int noOfDice;

    SnakeAndLadder(int noOfDice) {
        this.board = new Board();
        this.playerList = new LinkedList<>();
        this.noOfDice = noOfDice;
        dice = new Dice(this.noOfDice);
    }

//    Set board size
    public void setBoardSize(int boardSize) {
        board.setSize(boardSize);
    }

//    Set Players List
    public void setPlayers(int noOfPlayers, List<Player> playerList) {
        this.initialNoOfPlayers = noOfPlayers;
        for (Player player : playerList) {
            this.playerList.add(player);
            board.placePlayersOnBoard(player.getName(), 0);
        }
    }

//    Set snakes list
    public void setSnakes(List<Snake> snakesPosition) {
        board.placeSnakesOnBoard(snakesPosition);
    }

//  Set ladders list
    public void setLadder(List<Ladder> ladderPosition){
        board.placeLaddersOnBoard(ladderPosition);
    }

//  Get Dice value
    public int getDiceValue(int turnCounter){
        ++turnCounter;
        diceValue = dice.rollDice();
        if(diceValue == (6*noOfDice)){
            if(turnCounter <= 2){
                diceValue = (6*noOfDice) + getDiceValue(turnCounter);
            }
            else{
                return 0;
            }
        }
        return diceValue;
    }

//  Update player position on normal move
    private void movePlayer(Player player, int newValue){
        int initialPosition = board.getCurrentBoard().get(player.getName());

        if(initialPosition + newValue > board.getSize()){
            System.out.println("Invalid move, " + player.getName()+" is still at "  + initialPosition);
        }else {
            int pord = board.checkSnakeOrLadder(player, initialPosition, newValue);
            if (newValue != pord) {
//                newValue = pord;
                board.placePlayersOnBoard(player.getName(), pord);
                System.out.println(player.getName() + " rolled a " + diceValue + " and moved from " + initialPosition + " to " + (initialPosition + newValue) + " and got promoted or demoted to " + pord);
            }else {
                board.placePlayersOnBoard(player.getName(), initialPosition + newValue);
                System.out.println(player.getName() + " rolled a " + diceValue + " and moved from " + initialPosition + " to " + (initialPosition + newValue));

            }
        }
    }

    private Boolean hasPlayerWon(Player player){
        if(board.getCurrentBoard().get(player.getName()) == board.getSize()){
            return true;
        }
        return false;
    }

    private Boolean isGameComplete(){
        int currentNoOfPlayers = board.getCurrentBoard().size();
        return currentNoOfPlayers < this.initialNoOfPlayers;
    }

    public void startGame() {
        while(!isGameComplete()){
            Player playerTurn = playerList.poll();

            this.diceValue = this.getDiceValue(0);

            this.movePlayer(playerTurn, diceValue);

            if(hasPlayerWon(playerTurn)) {
                System.out.println("Congratulations! " + playerTurn.getName() + " won the game!");
                board.getCurrentBoard().remove(playerTurn.getName());
            }else{
                playerList.add(playerTurn);
            }
        }
    }
}
