import entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsDemo8 {
    public static void main(String[] args) {
//      Pet SET test
        Dog8 dog8 = new Dog8("Jeck", 5, 50, new HashSet<>(2));
        dog8.habits.add("run");
        dog8.habits.add("dance");
        System.out.println(dog8);
//      Human MAP test
        Man8 man8 = new Man8("Michael", "Karleone", 1977,80, new HashMap<String, String>(), dog8);
        man8.schedule.put("monday","tas1");
        man8.schedule.put("wednesday","task3");
        System.out.println(man8);
//      Family LIST test
        Man8 man9 = new Man8("Bob", "Karleone", 1987,50, new HashMap<String, String>(), dog8);
        man9.schedule.put("day2","tas11");
        man9.schedule.put("day1","task33");
        Woman8 woman8 = new Woman8("Elene", "Karleone", 1980,50, new HashMap<String, String>(), dog8);
        Woman8 daughter8 = new Woman8("Katya", "Karleone", 2000,50, new HashMap<String, String>(), dog8);
        Man8 son8 = new Man8("Jeck", "Karleone", 2010,50, new HashMap<String, String>(), dog8);
        Family8 family8 = new Family8(man8, woman8, new ArrayList<>(), new HashSet<>());
        family8.children.add(daughter8);
        family8.children.add(son8);
        family8.children.remove(son8);
        System.out.println(family8.children.toString());
        family8.pet8.add(dog8);
        family8.pet8.add(dog8);
        System.out.println(family8.pet8.toString());
        System.out.println(family8);
//      Family SET pets test
        Fish8 fish8 = new Fish8("NAna", 1, 30, new HashSet<>(2));
        fish8.habits.add("swim");
        fish8.habits.add("eat");
        RoboCat8 roboCat8 = new RoboCat8("12Genrf", 1, 100, new HashSet<>());
        roboCat8.habits.add("switch");
        roboCat8.habits.add("think");
        family8.pet8.add(fish8);
        family8.pet8.add(roboCat8);
        family8.pet8.remove(roboCat8);
        System.out.println(family8.pet8.toString());
        System.out.println(family8);
    }
}
