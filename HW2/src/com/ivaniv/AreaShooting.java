package com.ivaniv;
import java.util.Random;
import java.util.Scanner;

public class AreaShooting {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int randomCol = random.nextInt(diff);
        randomCol += min ;
        int randomRow = random.nextInt(diff);
        randomRow += min ;
//        System.out.println(randomRow);
//        System.out.println(randomCol);
        Boolean userWon = false;
        String playField [][] = {{"- |","- |","- |","- |","- |"},
                {"- |","- |","- |","- |","- |"},
                {"- |","- |","- |","- |","- |"},
                {"- |","- |","- |","- |","- |"},
                {"- |","- |","- |","- |","- |"}};
        while (!userWon) {
            System.out.println("Input number from 1 to 5 for row: ");
            Scanner scaner = new Scanner(System.in);
            int row = scaner.nextInt()-1;
            System.out.println("Input number from 1 to 5 for column: ");
            int col = scaner.nextInt()-1;
            if (randomRow == row+1 && randomCol == col+1 ){
                playField[col][row] = "X |";
                userWon = true;
            } else {
                playField[col][row] = "* |";
                userWon = false;
            }
            System.out.println("` 0 | 1 | 2 | 3 | 4 | 5 | `");
            for (int i = 0; i < playField.length; i++) {
                System.out.print("` "+ (i + 1) + " | ");
                for (int j = 0; j < playField[i].length; j++) {
                    System.out.print(playField[i][j] + " ");
                }
                System.out.println("`");
            }

        }  System.out.println("You have won!");
    }
}
