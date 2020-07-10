package com.ivaniv;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        System.out.print("Input your name: ");
        Scanner scaner = new Scanner(System.in);
        String name = scaner.next();
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int randomNumber = random.nextInt(diff + 1);
        randomNumber += min;
//        System.out.println(randomNumber);
        int guess = 0;
        while (guess != randomNumber) {
            System.out.print("Input number from 0 to 100: ");
            String inputedNumber = scaner.next();
            guess = Integer.parseInt(inputedNumber);
            if(guess > randomNumber) System.out.println("Your number is too big. Please, try again.");
            if(guess < randomNumber) System.out.println("Your number is too small. Please, try again.");
        }
        System.out.println("Congratulations " +  name);
    }
}
