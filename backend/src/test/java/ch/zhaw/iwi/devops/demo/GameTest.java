package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testGutterGame() {
        rollMany(0, 20);
        Assertions.assertEquals(0, game.score());
    }

    @Test
    public void testAllOnes() {
        rollMany(1, 20);
        Assertions.assertEquals(20, game.score());
    }

    @Test
    public void testSpare() {
        rollSpare();
        game.roll(3);
        rollMany(0, 17);
        Assertions.assertEquals(16, game.score());
    }

    @Test
    public void testStrike() {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(0, 16);
        Assertions.assertEquals(24, game.score());
    }

    @Test
    public void testPerfectGame() {
        rollMany(10, 12);
        Assertions.assertEquals(300, game.score());
    }

    private void rollMany(int pins, int rolls) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);
        }
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollStrike() {
        game.roll(10);
    }
}
