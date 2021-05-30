/*
 * this is a tic tac toe game that I wrote in java !
 * to play the game you need to lunch the it and then
 * it will ask you for a input type a number from 1 - 9 to show the
 * coordinates you want to go then wait for the other player to go.
 *
 * */

import java.util.Scanner;

public class Game {

    public String square1 = "1", square2 = "2", square3 = "3";
    public String square4 = "4", square5 = "5", square6 = "6";
    public String square7 = "7", square8 = "8", square9 = "9";

    public int player1Input;
    public int player2Input;

    public int winner = 0; // can be 0, 1, 2

    public void grid() {
        System.out.println("   |   |   ");
        System.out.println(" " + square1 + " | " + square2 + " | " + square3 + " ");
        System.out.println("---|---|---");
        System.out.println(" " + square4 + " | " + square5 + " | " + square6 + " ");
        System.out.println("---|---|---");
        System.out.println(" " + square7 + " | " + square8 + " | " + square9 + " ");
        System.out.println("   |   |   ");
    }

    public void setGrid(int playerInput, String symbol) {
        switch (playerInput) {
            case 1:
                square1 = symbol;
                break;
            case 2:
                square2 = symbol;
                break;
            case 3:
                square3 = symbol;
                break;
            case 4:
                square4 = symbol;
                break;
            case 5:
                square5 = symbol;
                break;
            case 6:
                square6 = symbol;
                break;
            case 7:
                square7 = symbol;
                break;
            case 8:
                square8 = symbol;
                break;
            case 9:
                square9 = symbol;
                break;
            default :
            	System.out.println("inva");
        }
    }

    public void checkInput(String symbol, int player) {
        if (square1 == symbol && square2 == symbol && square3 == symbol) {
            winner = player;
        }
        if (square4 == symbol && square5 == symbol && square6 == symbol) {
            winner = player;
        }
        if (square7 == symbol && square8 == symbol && square9 == symbol) {
            winner = player;
        }

        if (square1 == symbol && square4 == symbol && square7 == symbol) {
            winner = player;
        }
        if (square2 == symbol && square5 == symbol && square8 == symbol) {
            winner = player;
        }
        if (square3 == symbol && square6 == symbol && square9 == symbol) {
            winner = player;
        }

        if (square1 == symbol && square5 == symbol && square9 == symbol) {
            winner = player;
        }
        if (square3 == symbol && square5 == symbol && square7 == symbol) {
            winner = player;
        }
    }

    public void whoWon() {
        if (winner == 1) {
            System.out.println("player1 won!");
        } else if (winner == 2) {
            System.out.println("player2 won!");
        }
    }

    public void run() {
        grid();
        while (winner == 0) {
            System.out.print("player one : ");
            player1Input = (new Scanner(System.in)).nextInt();
            setGrid(player1Input, "X");
            checkInput("X", 1);
            grid();

            if (winner != 0) {
                break;
            }

            System.out.print("player two : ");
            player2Input = (new Scanner(System.in)).nextInt();
            setGrid(player2Input, "O");
            checkInput("O", 2);
            grid();
        }
        
        whoWon();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
