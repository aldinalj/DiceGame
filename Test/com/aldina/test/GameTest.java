package com.aldina.test;

import com.aldina.dicegame.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GameTest {

    @Test
    public void diceRollTest() {
        Dice dice = new Dice();
        for (int i = 0; i < 1000; i++) {
            int result = dice.roll();
            assertTrue(result >= 1 && result <= 6, "Dice roll result out of range: " + result);
        }
    }
}