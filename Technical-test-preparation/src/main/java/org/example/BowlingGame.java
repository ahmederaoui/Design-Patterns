package org.example;

public class BowlingGame {
    private int score =0;
    private int[] rolls =new  int[20];
    private int counter = 0;


    public void update(int i) {
        rolls[counter++]=i;
    }

    public int score() {
        int roll = 0;
        for (int frame = 0;frame<10;frame++){
            if (isStrike(roll)){
                score+=10+rolls[roll+2];
                roll+=2;
            } else if (isSpare(roll)) {
                score+=10+rolls[roll+1]+rolls[roll+2];
                roll+=1;
            } else {
                score+=rolls[roll]+rolls[roll+1];
                roll+=2;
            }

        }
        return score;
    }

    private boolean isSpare(int roll) {
        return rolls[roll] == 10;
    }

    private boolean isStrike(int roll) {
        return (rolls[roll] + rolls[roll + 1]) == 10;
    }
}
