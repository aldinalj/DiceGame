package com.aldina.test;

import com.aldina.dicegame.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player = new Player();

    @Test
    void setName() {
        player.setName("Benny");
        assertEquals("Benny", player.getName(), "The name was not set correctly");
    }

    @Test
    void increaseScore() {
        player.increaseScore(10);
        assertEquals(10,player.getScore(), "The score was not increased correctly");
    }

}