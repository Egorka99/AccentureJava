package com.AccentureJava.BullsAndCowsGame;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class BullsAndCows {
    private int difficulty;

    String computerNumberInString;

    private int cows;
    private int bulls;
    private int computerNumber;

    public BullsAndCows(int difficulty, int playerNumber) {
        this.difficulty = difficulty;

        computerNumberInString =  String.valueOf(computerNumber);
    }

    protected int generateNumber() {
        Set<Integer> uniqueNumbers = new TreeSet<>();
        int randomNum;
        while(uniqueNumbers.size() != difficulty) {
            randomNum = ThreadLocalRandom.current().nextInt(0, 9 + 1);
            uniqueNumbers.add(randomNum);
        }
        computerNumber = Integer.parseInt(uniqueNumbers.toString());
    }

    protected int determineTheNumberOfCows(int playerNumber) {

        String playerNumberInString = String.valueOf(playerNumber);

        int cowsCount = 0;
        for (int i = 0; i < computerNumberInString.length(); i++) {
            for (int j = 0; j < playerNumberInString.length(); j++) {
                if ( i != j && computerNumberInString.charAt(i) == playerNumberInString.charAt(j) ) {
                    cowsCount++;
                }
            }
        }
        return cowsCount;

    }
    protected int determineTheNumberOfBulls(int playerNumber) {

        String playerNumberInString = String.valueOf(playerNumber);

        int bullsCount = 0;
        for (int i = 0; i < computerNumberInString.length(); i++) {
            if (computerNumberInString.charAt(i) == playerNumberInString.charAt(i)) {
                bullsCount++;
            }

        }
        return bullsCount;
    }

    public void playTheGame(int playerNumber) {
        computerNumber = generateNumber();

        while(playerNumber != computerNumber) {
            System.out.println("Количество быков: " + determineTheNumberOfBulls(playerNumber));
            System.out.println("Количество коров: " + determineTheNumberOfCows(playerNumber));
        }
        System.out.println("Вы выиграли!");

    }
}
