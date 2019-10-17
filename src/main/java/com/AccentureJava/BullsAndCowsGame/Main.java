package com.AccentureJava.BullsAndCowsGame;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static int difficulty;

    private static void playTheGame() {
        Scanner scanner = new Scanner(System.in);
        chooseDifficulty();
        BullsAndCows game = new BullsAndCows(difficulty);

        while (!game.isGameEnded()) {
            System.out.println("Введите число длиной "+difficulty+": ");

            String inputData; 
            String playerNumber;

            while (true) {
                inputData = scanner.nextLine();

                if (tryParseInt(inputData))  {
                    playerNumber = String.valueOf(Integer.parseInt(inputData));
                }
                else {
                    System.err.println("Oшибка. Введите число");
                    continue;
                }
                System.out.println(playerNumber.length());

                if (playerNumber.length() == difficulty || playerNumber.equals("1")) {
                    if (!hasDublicates(playerNumber)) {
                        break;
                    }
                    else {
                        System.err.println("Ошибка. Все цифры должны быть уникальными");
                        continue;
                    }
                }
                else {
                    System.err.println("Oшибка. Введите число длиной "+difficulty+", или 1 - чтобы сдаться");
                    continue;
                }


            }
            game.playTheGame(playerNumber);
        }

    }

    private static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean hasDublicates(String playerNumber) {
        Set<Character> uniqueDigits = new HashSet<>();
        for (Character symbol: playerNumber.toCharArray()) {
            uniqueDigits.add(symbol);
        }
        return uniqueDigits.size() < playerNumber.length();
    }

    private static void chooseDifficulty() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите сложность игры (3,4,5)");


        while (difficulty !=3 && difficulty !=4 && difficulty !=5) {

            String inputData = scanner.nextLine();

            if (tryParseInt(inputData)) {
                difficulty = Integer.parseInt(inputData);
            }
            else {
                System.err.println("Oшибка.Введите число");
                continue;
            }

            switch (difficulty) {
                case 3:
                case 4:
                case 5:
                    System.out.println("Старт игры");
                    break;
                default:
                    System.err.println("Введите 3,4 или 5");
                    break;
            }

        }
    }

    private static void startTheGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игра \"Быки и Коровы\"");
        System.out.println("Введите 1, чтобы начать игру.");
        System.out.println("Введите 2, чтобы ознакомится с правилами.");

        int gameMode = 0;
        while (gameMode != 1 && gameMode !=2) {

            String inputData = scanner.nextLine();

            if (tryParseInt(inputData)) {
                gameMode = Integer.parseInt(inputData);
            }
            else {
                System.err.println("Oшибка.Введите число");
                continue;
            }

            switch (gameMode) {
                case 1:
                    playTheGame();
                    break;
                case 2:
                    System.out.println("Правила игры");
                    break;
                default:
                    System.err.println("Введите 1 или 2");

            }
        }
    }

    public static void main(String[] args) {
        startTheGame();
    }


}
