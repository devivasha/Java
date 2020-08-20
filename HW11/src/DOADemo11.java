import controller.FamilyController11;
import doa.CollectionFamilyDao11;
import entity.*;
import service.FamilyService11;

import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;

public class DOADemo11 {
    public static void main(String[] args) throws ParseException {
        CollectionFamilyDao11 collectionFamilyDao11 = new CollectionFamilyDao11();
        FamilyService11 familyService11 = new FamilyService11(collectionFamilyDao11);
        FamilyController11 familyController11 = new FamilyController11(familyService11);
        Dog11 dog11 = new Dog11("Jeck", 5, 50, new HashSet<>(2));
        dog11.habits.add("run");
        dog11.habits.add("dance");
        Woman11 woman9 = new Woman11("Elene", "Karleone", "23/01/1999",50, new HashMap<String, String>(), dog11);
        Man11 man9 = new Man11("Michael", "Karleone", "23/01/1998",80, new HashMap<String, String>(), dog11);
        Family11 family11 = null;
        if (familyController11.createNewFamily(woman9, man9)) {
            family11 = familyController11.getFamilyById(familyController11.count() - 1);
        }
        if (family11 != null) {
            familyController11.bornChild(family11, "Michael", "Elene");
        }
        familyController11.createNewFamily(new Woman11("Olga", "GGGGG", "23/12/1999",50, new HashMap<String, String>(), dog11), new Man11("Bob", "GGGGG", "23/01/1999",80, new HashMap<String, String>(), dog11));
        familyController11.createNewFamily(new Woman11("Nana", "BBBBB", "23/10/1999",50, new HashMap<String, String>(), dog11), new Man11("Bil", "BBBBB","23/03/1999",80, new HashMap<String, String>(), dog11));
        System.out.println(familyController11.getFamiliesBiggerThan(3).toString());
        System.out.println(familyController11.getFamiliesLessThan(1).size());
        System.out.println(familyController11.countFamiliesWithMemberNumber(3));

        if (familyController11.deleteFamilyByIndex(0)) {
            familyController11.displayAllFamilies();
        }
        Human11 child = new Man11("Richard", "GGGGG", "12/05/1999",50, new HashMap<String, String>(), dog11);
        if (familyController11.adoptChild(family11, child)) {
            System.out.println("Adopted child");
        }
//        System.out.println(family9.toString());
        familyController11.deleteAllChildrenOlderThen(8);
//        System.out.println(familyController9.getFamilyById(0).toString());

        System.out.println(familyController11.count());

//        familyController9.addPet(0, dog8);
//        System.out.println(familyController9.getPets(0).toString());
        System.out.println(familyController11.getFamilyDao().toString());
    }
}
