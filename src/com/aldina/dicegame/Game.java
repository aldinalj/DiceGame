package com.aldina.dicegame;

public class Game {
    public static final String colourReset = "\u001B[0m";
    public static final String blueText = "\u001B[34m";
    public static final String greenText = "\u001B[32m";

    InputHandler ih;

    int totalDice;
    int rounds;
    Dice dice;

    public Game(int totalDice, InputHandler ih) {
        this.totalDice = totalDice;
        this.rounds = 3;
        this.dice = new Dice();
        this.ih = ih;
    }

    public Player[] play(Player[] players) {

        for (int i = 0; i < rounds; i++) {
            System.out.println(blueText + "Round " + (i + 1) + ":" + colourReset);
            ih.takeString();

            for (int j = 0; j < players.length; j++) {
                System.out.print(greenText + players[j].getName() + colourReset);
                int roundScore = 0;

                for (int k = 0; k < totalDice; k++) {
                    ih.takeString();
                    int diceValue = dice.roll();
                    System.out.print("Dice " + (k + 1) + ": " + diceValue);
                    roundScore += diceValue;
                    ih.clear();
                }
                System.out.println();
                players[j].increaseScore(roundScore);
            }

        }

        int maxScore = players[0].getScore();
        int amountOfWinners = 1;

        // Calculates the maximum score and how many has it
        for (int i = 1; i < players.length; i++) {
            if (players[i].getScore() > maxScore) {
                maxScore = players[i].getScore();
                amountOfWinners = 1;
            } else if (players[i].getScore() == maxScore) {
                amountOfWinners++;
            }
        }

        // Creates a new array to contain the winners
        Player[] newPlayers = new Player[amountOfWinners];
        int newPlayerPointer = 0;

        // Pushes winners into new array
        for (int i = 0; i < players.length; i++) {
            if (players[i].getScore() == maxScore) {
                // Push winner into new array
                newPlayers[newPlayerPointer] = players[i];
                newPlayerPointer++;
            }
        }
        if (amountOfWinners > 1) {
            System.out.println("Seems like the battle of the greatest isn't over...");
        }

        // Returns new array of players containing only the winners
        return newPlayers;

    }
}

