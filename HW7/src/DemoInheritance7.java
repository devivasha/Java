import com.DayOfWeek;

public class DemoInheritance7 {
    public static void main(String[] args) {
//      Pet tests abstract inheritance
        Dog7 dog7 = new Dog7("Jeck", 5, 50, new String[]{"eat","run"});
        System.out.println(dog7);
        dog7.eat();
        dog7.respond();
        dog7.foul();
        DomesticCat7 domesticCat7 = new DomesticCat7("Paddy", 10, 100, new String[]{"dance","jump"});
        System.out.println(domesticCat7);
        domesticCat7.eat();
        domesticCat7.respond();
        domesticCat7.foul();
        Fish7 fish7 = new Fish7("Alice", 2, 80, new String[]{"swim"});
        System.out.println(fish7);
        fish7.eat();
        fish7.respond();
        RoboCat7 roboCat7 = new RoboCat7("Bob", 15, 70, new String[]{"print", "coding"});
        System.out.println(roboCat7);
        roboCat7.eat();
        roboCat7.respond();
        roboCat7.foul();
        Unknown7 unknown7 = new Unknown7("Klark", 5, 20, new String[]{});
        System.out.println(unknown7);
        unknown7.respond();
//      Human tests classical inheritance
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
        String[][] schedule2 = new String[][] {{String.valueOf(wednesday), "task4"},{String.valueOf(monday), "task5"}};
        Woman7 woman7 = new Woman7("Elene", "Karleone", 1987, 90, schedule2, dog7);
        System.out.println(woman7);
        woman7.greetPet();
        woman7.makeup();
        Man7 man7 = new Man7("Michael", "Karleone", 1977,80, schedule2, roboCat7);
        System.out.println(man7);
        man7.greetPet();
        man7.repairCar();
    }
}
