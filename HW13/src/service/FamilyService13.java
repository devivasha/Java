package service;

import doa.CollectionFamilyDao13;
import doa.FamilyDoa13;
import entity.*;
import exception.FamilyOverflowException13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;


public class FamilyService13 {
    private CollectionFamilyDao13 collectionFamilyDao13;

    public FamilyService13(CollectionFamilyDao13 collectionFamilyDao12) {
        this.collectionFamilyDao13 = collectionFamilyDao12;
    }

    private List<Family13> getAllFamilies(){
        return this.collectionFamilyDao13.getAllFamilies();
    }

    public void displayAllFamilies(){
        this.collectionFamilyDao13.getAllFamilies().forEach(family12 -> System.out.println(family12.toString()));
    }

    public List<Family13> getFamiliesBiggerThan(int count){
        return this.collectionFamilyDao13.getAllFamilies().stream()
                .filter(family12 -> family12.countFamily() < count)
                .collect(Collectors.toList());
    }
    public List<Family13> getFamiliesLessThan(int count){
        return this.collectionFamilyDao13.getAllFamilies().stream()
                .filter(family12 -> family12.countFamily() > count)
                .collect(Collectors.toList());

    }
    public int countFamiliesWithMemberNumber(int count){
        return (int) this.collectionFamilyDao13.getAllFamilies().stream()
                .filter(family12 -> family12.countFamily() == count).count();
    }
    public boolean createNewFamily(Human13 mother, Human13 father){
        return this.collectionFamilyDao13.saveFamily(new Family13(mother, father));
    }
    public boolean deleteFamilyByIndex(int index){
        return this.collectionFamilyDao13.deleteFamilyByIndex(index);
    }

    public boolean bornChild(Family13 family12, String fatherName, String motherName) throws ParseException {

        if (family12.countFamily() > 5) {
            throw new FamilyOverflowException13(family12.countFamily());
        }

        if (family12.getMother() == null || family12.getFather() == null) {
            return false;
        }
        Random random = new Random();
        Human13 child;
        int iq = (family12.getFather().getIq() + family12.getMother().getIq()) / 2;
        if (random.nextInt(2) == 1) {
            String name = fatherName;
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            child = new Man13(name, family12.getFather().getSurname(), "23/01/1999", iq);
        } else {
            String name = motherName;
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            child = new Woman13(name, family12.getFather().getSurname(), "23/01/1999", iq);
        }
        family12.addChild(child);
        return true;
    }

    public boolean adoptChild(Family13 family12, Human13 human12) {
        if (family12.countFamily() > 5) {
            throw new FamilyOverflowException13(family12.countFamily());
        }

        boolean check = false;
        for (Family13 currFamily : this.collectionFamilyDao13.getAllFamilies()) {
            if (family12.equals(currFamily)) {
                currFamily.addChild(human12);
                check = true;
                break;
            }
        }
        return check;
    }

    public void deleteAllChildrenOlderThen(int age) {
        this.collectionFamilyDao13.getAllFamilies()
                .forEach(family12 -> {
                 List<Human13> removedChildren = family12.getChildren().stream()
                            .filter(child -> Integer.parseInt(child.describeAge().split("-years")[2]) > age)
                            .collect(Collectors.toList());
                    removedChildren.forEach(family12:: deleteChild);
                });
    }
    public int count(){
        return this.collectionFamilyDao13.getAllFamilies().size();
    }
    public Family13 getFamilyById(int index){
        return this.collectionFamilyDao13.getFamilyByIndex(index);
    }

    public Set<Pet13> getPets(int index) {
        return this.collectionFamilyDao13.getFamilyByIndex(index).getPets();
    }

    public void addPet(int familyIndex, Pet13 pet12){
        this.collectionFamilyDao13.getFamilyByIndex(familyIndex).addPet(pet12);
    }
    public FamilyDoa13 getFamilyDao() {
        return this.collectionFamilyDao13;
    }

    public boolean loadData() throws IOException {
        return this.collectionFamilyDao13.loadData();
    }

    public boolean uploadFamilies() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("families.txt"));
            boolean flag = true;
            while (flag) {
                try {
                    this.collectionFamilyDao13.saveFamily((Family13) objectInputStream.readObject());
                } catch (Exception e) {
                    flag = false;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
