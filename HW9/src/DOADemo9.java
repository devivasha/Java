import controller.FamilyController9;
import doa.CollectionFamilyDao9;
import entity.*;
import service.FamilyService9;
import java.util.HashMap;
import java.util.HashSet;

public class DOADemo9 {
    public static void main(String[] args) {
        CollectionFamilyDao9 collectionFamilyDao9 = new CollectionFamilyDao9();
        FamilyService9 familyService9 = new FamilyService9(collectionFamilyDao9);
        FamilyController9 familyController9 = new FamilyController9(familyService9);
        Dog12 dog8 = new Dog12("Jeck", 5, 50, new HashSet<>(2));
        dog8.habits.add("run");
        dog8.habits.add("dance");
        Human9 woman9 = new Woman9("Elene", "Karleone", 1980,50, new HashMap<String, String>(), dog8);
        Human9 man9 = new Man9("Michael", "Karleone", 1977,80, new HashMap<String, String>(), dog8);
        Family9 family9 = null;
        if (familyController9.createNewFamily(woman9, man9)) {
            family9 = familyController9.getFamilyById(familyController9.count() - 1);
        }
        if (family9 != null) {
            familyController9.bornChild(family9, "Michael", "Elene");
        }
        familyController9.createNewFamily(new Woman9("Olga", "GGGGG", 1980,50, new HashMap<String, String>(), dog8), new Man9("Bob", "GGGGG", 1977,80, new HashMap<String, String>(), dog8));
        familyController9.createNewFamily(new Woman9("Nana", "BBBBB", 1980,50, new HashMap<String, String>(), dog8), new Man9("Bil", "BBBBB", 1977,80, new HashMap<String, String>(), dog8));
        System.out.println(familyController9.getFamiliesBiggerThan(3).toString());
        System.out.println(familyController9.getFamiliesLessThan(1).size());
        System.out.println(familyController9.countFamiliesWithMemberNumber(3));

        if (familyController9.deleteFamilyByIndex(0)) {
            familyController9.displayAllFamilies();
        }
        Human9 child = new Man9("Richard", "GGGGG", 2010,50, new HashMap<String, String>(), dog8);
        if (familyController9.adoptChild(family9, child)) {
            System.out.println("Adopted child");
        }
//        System.out.println(family9.toString());
        familyController9.deleteAllChildrenOlderThen(8);
//        System.out.println(familyController9.getFamilyById(0).toString());

        System.out.println(familyController9.count());

//        familyController9.addPet(0, dog8);
//        System.out.println(familyController9.getPets(0).toString());
        System.out.println(familyController9.getFamilyDao().toString());
    }
}
