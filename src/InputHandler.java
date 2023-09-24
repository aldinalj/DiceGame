import java.util.Scanner;

public class InputHandler {
    private Scanner in;

    public InputHandler() {
        in = new Scanner(System.in);
    }

    public int takeNumber() {
        return in.nextInt();
    }

    public boolean hasNumber() {
        return in.hasNextInt();
    }

    public void clear() {
        in = new Scanner(System.in);
    }
}
