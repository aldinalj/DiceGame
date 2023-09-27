public class Main {
    public static final String colourReset = "\u001B[0m";
    public static final String redText = "\u001B[31m";
    public static final String blueText = "\u001B[34m";
    public static final String greenText = "\u001B[32m";

    public static void main(String[] args) {
        System.out.println("Hello and welcome to the game of the year, the very original \"The Dice Game\". This game requires at least " + redText + "2 players." + colourReset);

        InputHandler ih = new InputHandler();

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

        String[] playerNames = new String[totalPlayers];
        System.out.println("Please enter your desired names!");
        ih.clear();

        for (int i = 0; i < totalPlayers; i++) {
            System.out.print("Player # " + (i + 1) + ": ");
            playerNames[i] = ih.takeString();
        }
        System.out.println("How many dice would you like to play with? You can choose between 1-10.");

        int totalDice;

        while (true) {
            if (ih.hasNumber()) {
                totalDice = ih.takeNumber();

                if (totalDice >= 1 && totalDice < 11) {
                    System.out.println("You will have 5 rounds to virtually roll " + totalDice + " dice. You will battle until theres only one left standing. Press enter to roll. Good luck!");
                    break;
                } else {
                    System.out.println("You have to choose between " + redText + "1-10." + colourReset + " Please try again");
                }
            } else {
                System.out.println("You did not enter a valid number. Please try again.");
                ih.clear();
            }
        }

        Dice diceRoll = new Dice();
        int rounds = 5;

        for (int i = 0; i < rounds; i++) {
            System.out.println( blueText + "Round " + (i+1) + ":" + colourReset);
            ih.takeString();

            for (int j = 0; j < totalPlayers; j++) {
                System.out.print(greenText + playerNames[j] + colourReset);

                for (int k = 0; k < totalDice; k++) {
                    ih.takeString();
                    int diceValue = diceRoll.roll();
                    System.out.println("Dice " + (k + 1) + ": " + diceValue);
                    ih.clear();
                }

            }

        }

    }
}


