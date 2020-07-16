package com;

import java.util.Arrays;

public class DemoFamily5 {
    public static void main(String[] args) {
        String[][] schedule1 = new String[][] {{"day", "task"},{"day2", "task2"}};
        String[][] schedule2 = new String[][] {{"day4", "task4"},{"day5", "task5"}};
        Human5 humanTest1= new Human5("Michael", "Karleone", 1977,80, schedule1);
        Human5 humanTest2 = new Human5("Elene", "Karleone", 1987, 90, schedule2);
        Human5 humanChild1 = new Human5("Bob", "Karleone", 2010, 100, schedule2);
        Human5 humanChild2 = new Human5("Anna", "Karleone", 2010, 100, schedule2);
        Human5 humanChild3 = new Human5("Johan", "Karleone", 2010, 100, schedule2);
        Family family = new Family(humanTest1, humanTest2);
        System.out.println(family);
        family.addChild(humanChild1);
        family.addChild(humanChild2);
        family.addChild(humanChild3);
        System.out.println(family);
        family.deleteChild(0);
        System.out.println(family);
        family.countFamily();
    }
}
