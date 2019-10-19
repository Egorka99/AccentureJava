package com.AccentureJava.BullsAndCowsGame;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class BullsAndCows {

    private int difficulty;
    private StringBuilder computerNumber;
    private int countTries;
    private boolean isGameEnded;

    public BullsAndCows(int difficulty) {
        this.difficulty = difficulty;
        computerNumber = new StringBuilder();
        generateNumber();
    }

    public boolean isGameEnded() {
        return isGameEnded;
    }

    private void generateNumber() {
        Set<Integer> uniqueNumber = new TreeSet<>();
        int randomDigit;
        while(uniqueNumber.size() != difficulty) {
            randomDigit = ThreadLocalRandom.current().nextInt(0, 9 + 1);
            uniqueNumber.add(randomDigit);
        }
        for (Integer digit: uniqueNumber) {
            computerNumber.append(digit);
        }
    }

    private int determineCountOfCows(String playerNumber) {

        int cowsCount = 0;
        for (int i = 0; i < difficulty; i++) {
            for (int j = 0; j < difficulty; j++) {
                if ( i != j && computerNumber.charAt(i) == playerNumber.charAt(j) ) {
                    cowsCount++;
                }
            }
        }
        return cowsCount;

    }
    private int determineCountOfBulls(String playerNumber) {
        int bullsCount = 0;
        for (int i = 0; i < difficulty; i++) {
            if (computerNumber.charAt(i) == playerNumber.charAt(i)) {
            bullsCount++;
            }
        }
        return bullsCount;
    }

    public void playTheGame(String playerNumber) {

        if (playerNumber.equals("1")) {
            System.out.println("Игра окончена. Введенное число - " + computerNumber);
            isGameEnded = true;
        }
        else if (playerNumber.equals(computerNumber.toString())) {
            isGameEnded = true;
            countTries++;
            System.out.println("Вы выиграли!");
            System.out.println("Количество попыток: "+countTries);
        }
        else {
            System.out.println("Количество быков: " + determineCountOfBulls(playerNumber));
            System.out.println("Количество коров: " + determineCountOfCows(playerNumber));
            System.out.println("Не угадали, попытайтесь еще");
            System.out.println("Вы можете сдаться, введя 1");
            countTries++;
        }

    }
}
