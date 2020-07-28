package com;

public class DemoFamily6 {
    public static void main(String[] args) {
        DayOfWeek friday = DayOfWeek.FRIDAY;
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
        String[][] schedule1 = new String[][] {{String.valueOf(friday), "task"},{String.valueOf(sunday), "task2"}};
        String[][] schedule2 = new String[][] {{String.valueOf(wednesday), "task4"},{String.valueOf(monday), "task5"}};
        Human6 humanTest1= new Human6("Michael", "Karleone", 1977,80, schedule1);
        Human6 humanTest2 = new Human6("Elene", "Karleone", 1987, 90, schedule2);
        Human6 humanChild1 = new Human6("Bob", "Karleone", 2010, 100, schedule2);
        Human6 humanChild2 = new Human6("Anna", "Karleone", 2010, 100, schedule2);
        Human6 humanChild3 = new Human6("Johan", "Karleone", 2010, 100, schedule2);
        Pet6 pet = new Pet6(Species.DOG, "Paddy", 5, 50, new String[]{"eat","run"});
        Family6 family = new Family6(humanTest1, humanTest2, new Human6[]{humanChild1, humanChild2, humanChild3}, pet);
        System.out.println(family);
        family.addChild(humanChild1);
        family.addChild(humanChild2);
        family.addChild(humanChild3);
        System.out.println(family);
        family.deleteChild(0);
        System.out.println(family);
        family.countFamily();

        Human6[] array = new Human6[10000000];
        for(int i = 0; i < 10000000; i++){
            array[i] = new Human6("Anna", "Karleone", 2010, 100, schedule2);
        }

    }
}
