package com.aldina.dicegame;

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

    public String takeString() {
        return in.nextLine();
    }

    public void clear() {
        in = new Scanner(System.in);
    }
}
