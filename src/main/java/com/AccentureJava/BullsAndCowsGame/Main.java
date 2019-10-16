package com.AccentureJava.BullsAndCowsGame;

import java.util.Scanner;

public class Main {

    void startTheGame() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BullsAndCows game = new BullsAndCows(3);

        while (!game.isGameEnded()) {
            System.out.println("Введите число: ");
            game.playTheGame(scanner.nextLine());
        }
 
    }
}
