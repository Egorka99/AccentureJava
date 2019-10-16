package com.AccentureJava.BullsAndCowsGame;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class BullsAndCows {
    private int difficulty;
    private int playerNumber;

    private int cows;
    private int bulls;
    private int computerNumber;

    public BullsAndCows(int difficulty, int playerNumber) {
        this.difficulty = difficulty;
        this.playerNumber = playerNumber;
    }

    private void generateNumber() {
        Set<Integer> uniqueNumbers = new TreeSet<>();
        int randomNum;
        while(uniqueNumbers.size() != difficulty) {
            randomNum = ThreadLocalRandom.current().nextInt(0, 9 + 1);
            uniqueNumbers.add(randomNum);
        }
        computerNumber = Integer.parseInt(uniqueNumbers.toString());
    }

    private void determineTheNumberOfCows() {

    }
    private void determineTheNumberOfBulls() {

    }

    public void playTheGame() {

    }
}
