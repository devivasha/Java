package com;



public class DemoFamily {
    public static void main(String[] args) {
        // Pet class constructors
        Pet emptyDog = new Pet();
        System.out.println(emptyDog.toString());
        Pet dog = new Pet("dog", "Bob");
        System.out.println(dog.toString());
        String[] catHabits = {"eat", "drink", "sleep"};
        Pet cat = new Pet("cat", "Paddy", 3, 80, catHabits );
        System.out.println(cat.toString());
        cat.eat();
        cat.respond();
        cat.foul();

        // Human class constructors
        Human emptyHuman = new Human();
        Human father = new Human("Michael", "Karleone", 1977);
        Human mother = new Human("Elene", "Karleone", 1987);
        Human daughter = new Human("Olga","Karleone", 2000, 80, mother, father);
        Human sun = new Human("Bob", "Karleone", 2010, 90,  mother, father, cat);
        System.out.println(emptyHuman.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(daughter.toString());
        System.out.println(sun.toString());
        sun.describePet();
        sun.greetPet();
    }
}
