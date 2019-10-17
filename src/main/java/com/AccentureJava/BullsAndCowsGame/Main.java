package com.AccentureJava.BullsAndCowsGame;

import java.awt.*;
import java.util.HashSet;
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

                if (playerNumber.length() == difficulty || playerNumber.equals("1")) {
                    if (!hasDublicates(playerNumber)) {
                        break;
                    }
                    else {
                        System.err.println("Ошибка. Все цифры должны быть уникальными");
                    }
                }
                else {
                    System.err.println("Oшибка. Введите число длиной "+difficulty+", или 1 - чтобы сдаться");
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
                    System.out.println("Правила игры: ");
                    System.out.println("Вначале игроку нужно ввести сложность игры – 3, 4 или 5. Сложность игры – длина\n" +
                            "загадываемой программой последовательности цифр (0-9). При вводе некоректной сложности игра\n" +
                            "завершается.");
                    System.out.println("После определения сложности игры, программа генерирует случайную последовательность цифр, при чем\n" +
                            "все цифры должны быть разными(например, 0247).");
                    System.out.println("После этого игроку требуется ввести свою отгадку последовательности. Валидной попыткой\n" +
                            "считается последовательность различных цифр правильной длины (например, 1234). Невалидные попытки\n" +
                            "отклоняются.");
                    System.out.println("Для валидной попытки программа должна выдать игроку результат совпадения – 2 числа:\n" +
                            "✓ 1 число – «коровы» – число угаданных цифр, которые находятся на неправильных позициях;\n" +
                            "✓ 2 число – «быки» - число угаданных цифр, которые находятся на правильных позициях;");
                    System.out.println("Если после попытки игрок полностью правильно угадал загаданную последовательность, то ему\n" +
                            "выводится сообщение об успехе, значение загаданной последовательности и количество попыток. Игра\n" +
                            "завершается.");
                    System.out.println("Если после попытки игрок не угадал последовательность, то ему предлагается сделать\n" +
                            "следующую попытку.");
                    System.out.println("В качестве попытки игрок может напечатать «1», чтобы сдаться. Тогда ему будет выведена загаданная\n" +
                            "последовательность и игра завершится.");
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
