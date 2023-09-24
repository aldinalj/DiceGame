import java.util.Scanner;

public class Main {
    public static final String colourReset = "\u001B[0m";
    public static final String redText = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println("Hello and welcome to the game of the year, the very original \"The Dice Game\". This game requires at least " + redText + "2 players." + colourReset);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("How many players are you?");

            if (sc.hasNextInt()) {
                int totalPlayers = sc.nextInt();

                if (totalPlayers >= 2) {
                    System.out.println("Welcome to the battle of " + totalPlayers + "!");
                    break;
                } else {
                    System.out.println("You cannot be this total amount pf players. Please try again.");
                }
            } else {
                System.out.println("You did not enter a valid number. Please try again.");
                sc.nextLine();
            }
        }
    }
}
