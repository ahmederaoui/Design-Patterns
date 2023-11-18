package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    BowlingGame bowlingGame ;
    @BeforeEach
    void gameInitializer(){
        bowlingGame = new BowlingGame();
    }
    @Test
    void canScoreZero(){
        for (int i=0;i<20;i++){
            bowlingGame.update(0);
        }
        assertEquals(0,bowlingGame.score());
    }
    @Test
    void canScoreAllOne(){

        for (int i=0;i<20;i++){
            bowlingGame.update(1);
        }
        assertEquals(20,bowlingGame.score());
    }
    @Test
    void SpareFollowBy3Test(){
        bowlingGame.update(5);
        bowlingGame.update(5);
        bowlingGame.update(3);
        for (int i=0;i<17;i++){
            bowlingGame.update(0);
        }
        assertEquals(16,bowlingGame.score());
    }
    @Test
    void strikefollowedByTwoNumbers(){
        bowlingGame.update(10);
        bowlingGame.update(5);
        bowlingGame.update(3);
        for (int i=0;i<16;i++){
            bowlingGame.update(0);
        }
        assertEquals(26,bowlingGame.score());
    }
}
