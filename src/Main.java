public class Main {
    public static final String colourReset = "\u001B[0m";
    public static final String redText = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println("Hello and welcome to the game of the year, the very original \"The Dice Game\". This game requires at least " + redText + "2 players." + colourReset);

        //Scanner sc = new Scanner(System.in);
        InputHandler ih = new InputHandler();

        System.out.println("How many players are you?");
        while (true) {
            if (ih.hasNumber()) {
                int totalPlayers = ih.takeNumber();

                if (totalPlayers >= 2) {
                    System.out.println("Welcome to the battle of " + totalPlayers + "!");
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

        /*int[] playerArray = new int[totalPlayer];
        System.out.println("Please enter your desired names!");

        for (int i = 0; i < totalPlayers; i++) {
            System.out.println("Player #" + i + ":");
            String[] playerNames = sc.nextLine();


        }*/
    }
}
