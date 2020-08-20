package service;

import doa.CollectionFamilyDao12;
import doa.FamilyDoa12;
import entity.*;
import exception.FamilyOverflowException;

import java.text.ParseException;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;


public class FamilyService12 {
    private CollectionFamilyDao12 collectionFamilyDao12;

    public FamilyService12(CollectionFamilyDao12 collectionFamilyDao12) {
        this.collectionFamilyDao12 = collectionFamilyDao12;
    }

    private List<Family12> getAllFamilies(){
        return this.collectionFamilyDao12.getAllFamilies();
    }

    public void displayAllFamilies(){
        this.collectionFamilyDao12.getAllFamilies().forEach(family12 -> System.out.println(family12.toString()));
    }

    public List<Family12> getFamiliesBiggerThan(int count){
        return this.collectionFamilyDao12.getAllFamilies().stream()
                .filter(family12 -> family12.countFamily() < count)
                .collect(Collectors.toList());
    }
    public List<Family12> getFamiliesLessThan(int count){
        return this.collectionFamilyDao12.getAllFamilies().stream()
                .filter(family12 -> family12.countFamily() > count)
                .collect(Collectors.toList());

    }
    public int countFamiliesWithMemberNumber(int count){
        return (int) this.collectionFamilyDao12.getAllFamilies().stream()
                .filter(family12 -> family12.countFamily() == count).count();
    }
    public boolean createNewFamily(Human12 mother, Human12 father){
        return this.collectionFamilyDao12.saveFamily(new Family12(mother, father));
    }
    public boolean deleteFamilyByIndex(int index){
        return this.collectionFamilyDao12.deleteFamilyByIndex(index);
    }

    public boolean bornChild(Family12 family12, String fatherName, String motherName) throws ParseException {

        if (family12.countFamily() > 5) {
            throw new FamilyOverflowException(family12.countFamily());
        }

        if (family12.getMother() == null || family12.getFather() == null) {
            return false;
        }
        Random random = new Random();
        Human12 child;
        int iq = (family12.getFather().getIq() + family12.getMother().getIq()) / 2;
        if (random.nextInt(2) == 1) {
            String name = fatherName;
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            child = new Man12(name, family12.getFather().getSurname(), "23/01/1999", iq);
        } else {
            String name = motherName;
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            child = new Woman12(name, family12.getFather().getSurname(), "23/01/1999", iq);
        }
        family12.addChild(child);
        return true;
    }

    public boolean adoptChild(Family12 family12, Human12 human12) {
        if (family12.countFamily() > 5) {
            throw new FamilyOverflowException(family12.countFamily());
        }

        boolean check = false;
        for (Family12 currFamily : this.collectionFamilyDao12.getAllFamilies()) {
            if (family12.equals(currFamily)) {
                currFamily.addChild(human12);
                check = true;
                break;
            }
        }
        return check;
    }

    public void deleteAllChildrenOlderThen(int age) {
        this.collectionFamilyDao12.getAllFamilies()
                .forEach(family12 -> {
                 List<Human12> removedChildren = family12.getChildren().stream()
                            .filter(child -> Integer.parseInt(child.describeAge().split("-years")[2]) > age)
                            .collect(Collectors.toList());
                    removedChildren.forEach(family12:: deleteChild);
                });
    }
    public int count(){
        return this.collectionFamilyDao12.getAllFamilies().size();
    }
    public Family12 getFamilyById(int index){
        return this.collectionFamilyDao12.getFamilyByIndex(index);
    }

    public Set<Pet12> getPets(int index) {
        return this.collectionFamilyDao12.getFamilyByIndex(index).getPets();
    }

    public void addPet(int familyIndex, Pet12 pet12){
        this.collectionFamilyDao12.getFamilyByIndex(familyIndex).addPet(pet12);
    }
    public FamilyDoa12 getFamilyDao() {
        return this.collectionFamilyDao12;
    }

}
