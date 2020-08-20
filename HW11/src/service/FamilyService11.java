package service;

import doa.CollectionFamilyDao11;
import doa.FamilyDoa11;
import entity.*;

import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class FamilyService11 {
    private CollectionFamilyDao11 collectionFamilyDao11;

    public FamilyService11(CollectionFamilyDao11 collectionFamilyDao11) {
        this.collectionFamilyDao11 = collectionFamilyDao11;
    }

    private List<Family11> getAllFamilies(){
        return this.collectionFamilyDao11.getAllFamilies();
    }

    public void displayAllFamilies(){
        this.collectionFamilyDao11.getAllFamilies().forEach(family11 -> System.out.println(family11.toString()));
    }

    public List<Family11> getFamiliesBiggerThan(int count){
        return this.collectionFamilyDao11.getAllFamilies().stream()
                .filter(family11 -> family11.countFamily() < count)
                .collect(Collectors.toList());
    }
    public List<Family11> getFamiliesLessThan(int count){
        return this.collectionFamilyDao11.getAllFamilies().stream()
                .filter(family11 -> family11.countFamily() > count)
                .collect(Collectors.toList());

    }
    public int countFamiliesWithMemberNumber(int count){
        return (int) this.collectionFamilyDao11.getAllFamilies().stream()
                .filter(family11 -> family11.countFamily() == count).count();
    }
    public boolean createNewFamily(Human11 mother, Human11 father){
        return this.collectionFamilyDao11.saveFamily(new Family11(mother, father));
    }
    public boolean deleteFamilyByIndex(int index){
        return this.collectionFamilyDao11.deleteFamilyByIndex(index);
    }

    public boolean bornChild(Family11 family11, String fatherName, String motherName) throws ParseException {
        if (family11.getMother() == null || family11.getFather() == null) {
            return false;
        }
        Random random = new Random();
        Man11 child;
        int iq = (family11.getFather().getIq() + family11.getMother().getIq()) / 2;
        if (random.nextInt(2) == 1) {
            String name = fatherName;
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            child = new Man11(name, family11.getFather().getSurname(), "23/01/1999", iq, new HashMap<String, String>(), null);
        } else {
            String name = motherName;
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            child = new Man11(name, family11.getFather().getSurname(), "23/01/1999", iq, new HashMap<String, String>(), null);
        }
        family11.addChild(child);
        return true;
    }

    public boolean adoptChild(Family11 family11, Human11 human11) {
        boolean check = false;
        for (Family11 currFamily : this.collectionFamilyDao11.getAllFamilies()) {
            if (family11.equals(currFamily)) {
                currFamily.addChild(human11);
                check = true;
                break;
            }
        }
        return check;
    }

    public void deleteAllChildrenOlderThen(int age) {
//        this.collectionFamilyDao11.getAllFamilies()
//                .forEach(family11 -> {
//                 List<Human11> removedChildren = family11.getChildren().stream()
//                            .filter(child -> Integer.parseInt(child.describeAge().split("-years")[2]) > age)
//                            .collect(Collectors.toList());
//                    removedChildren.forEach(family11:: deleteChild);
//                });
    }
    public int count(){
        return this.collectionFamilyDao11.getAllFamilies().size();
    }
    public Family11 getFamilyById(int index){
        return this.collectionFamilyDao11.getFamilyByIndex(index);
    }

    public Set<Object> getPets(int index) {
        return this.collectionFamilyDao11.getFamilyByIndex(index).getPets();
    }

    public void addPet(int familyIndex, Pet11 pet11){
        this.collectionFamilyDao11.getFamilyByIndex(familyIndex).addPet(pet11);
    }
    public FamilyDoa11 getFamilyDao() {
        return this.collectionFamilyDao11;
    }

}
