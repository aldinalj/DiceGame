import java.util.Random;
public class Dice {
    Random rand = new Random();
    int upperbound = 7;
    int randomDice = rand.nextInt(upperbound);

}
