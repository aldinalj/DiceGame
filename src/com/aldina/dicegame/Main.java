package com.aldina.dicegame;
public class Main {
    public static final String colourReset = "\u001B[0m";
    public static final String redText = "\u001B[31m";
    public static void main(String[] args) {

        System.out.println("Hello and welcome to the game of the year, the very original \"The Dice Game\". This game requires at least " + redText + "2 players." + colourReset);

        InputHandler ih = new InputHandler();

        int totalPlayers = getTotalPlayers(ih);

        Player[] players = getPlayerNames(totalPlayers, ih);

        int totalDice = getTotalDice(ih);

        Game game = new Game(totalDice, ih);

       do {
           players = game.play(players);
       } while (players.length > 1);

        Player winner = players[0];

       System.out.println("\n" + winner.getName() + " won with a score of " + winner.getScore() + ". Congratulations!");

    }

    private static int getTotalDice(InputHandler ih) {
        System.out.println("How many dice would you like to play with? You can choose between 1-10.");

        int totalDice;

        while (true) {
            if (ih.hasNumber()) {
                totalDice = ih.takeNumber();

                if (totalDice >= 1 && totalDice < 11) {
                    System.out.println("You will have 3 rounds to virtually roll " + totalDice + " dice. You will battle until theres only one left standing. Press enter to roll. Good luck!");
                    break;
                } else {
                    System.out.println("You have to choose between " + redText + "1-10." + colourReset + " Please try again");
                }
            } else {
                System.out.println("You did not enter a valid number. Please try again.");
                ih.clear();
            }
        }
        return totalDice;
    }

    private static Player[] getPlayerNames(int totalPlayers, InputHandler ih) {
        Player[] players = new Player[totalPlayers];
        for (int i = 0; i < totalPlayers; i++) {
            players[i] = new Player();
        }

        System.out.println("Please enter your desired names!");
        ih.clear();

        for (int i = 0; i < totalPlayers; i++) {
            System.out.print("Player # " + (i + 1) + ": ");
            players[i].setName(ih.takeString());
        }
        return players;
    }

    private static int getTotalPlayers(InputHandler ih) {
        System.out.println("How many players are you?");
        int totalPlayers;
        while (true) {
            if (ih.hasNumber()) {
                totalPlayers = ih.takeNumber();

                if (totalPlayers >= 2) {
                    break;
                } else {
                    System.out.println("You cannot be this total amount of players. Please try again.");
                }
            } else {
                System.out.println("You did not enter a valid number. Please try again.");
                // Clear buffer
                ih.clear();

            }

        }
        return totalPlayers;
    }
}
