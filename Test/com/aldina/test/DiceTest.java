package com.aldina.test;

import com.aldina.dicegame.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    public void diceTest() {

        Dice dice = new Dice();
        assertNotNull(dice);

    }
}

