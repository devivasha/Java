package com.ivaniv;

import java.util.Scanner;

public class TaskPlanner {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0]= "Sunday";
        schedule[0][1]= "do home work; go to courses";
        schedule[1][0]= "Monday";
        schedule[1][1]= "go to courses; watch a film";
        schedule[2][0]= "Tuesday";
        schedule[2][1]= "go to school; do home work";
        schedule[3][0]= "Wednesday";
        schedule[3][1]= "do shopping; watch a film";
        schedule[4][0]= "Thursday";
        schedule[4][1]= "clean your home; go to school";
        schedule[5][0]= "Friday";
        schedule[5][1]= "meet your friends; watch a film";
        schedule[6][0]= "Saturday";
        schedule[6][1]= "sleep sleep sleep; do home work";

        Boolean exit = false;

        while(!exit){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, input the day of the week: ");
            String day = scanner.nextLine().toLowerCase().replaceAll(" ", "");
            switch (day) {
                case "sunday":
                    System.out.println("Your tasks for " + day + ":" + schedule[0][1]);
                    break;
                case "monday":
                    System.out.println("Your tasks for " + day + ":" + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your tasks for " + day + ":" + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your tasks for " + day + ":" + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your tasks for " + day + ":" + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your tasks for " + day + ":" + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your tasks for " + day + ":" + schedule[6][1]);
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
