package service;


import doa.CollectionFamilyDao9;
import entity.*;

import java.util.*;

public class FamilyService9 {
    private CollectionFamilyDao9 collectionFamilyDao9;
    public FamilyService9(CollectionFamilyDao9 collectionFamilyDao9) {
        this.collectionFamilyDao9 = collectionFamilyDao9;
    }

    private List<Family9> getAllFamilies(){
        return this.collectionFamilyDao9.getAllFamilies();
    }

    public void displayAllFamilies(){
        System.out.println(collectionFamilyDao9.toString());
    }

    public List<Family9> getFamiliesBiggerThan(int count){
        List<Family9> sortedList = new ArrayList<>();
        for (Family9 currentFamily: this.collectionFamilyDao9.getAllFamilies()){
            int countFamily = 0;
            if(currentFamily.getFather() != null) countFamily++;
            if(currentFamily.getMother() != null) countFamily++;
            countFamily += currentFamily.getChildren().size();
            if(countFamily > count) sortedList.add(currentFamily);
        }
        return sortedList;
    }
    public List<Family9> getFamiliesLessThan(int count){
        List<Family9> sortedList = new ArrayList<>();
        for (Family9 currentFamily: this.collectionFamilyDao9.getAllFamilies()){
            int countFamily = 0;
            if(currentFamily.getFather() != null) countFamily++;
            if(currentFamily.getMother() != null) countFamily++;
            countFamily += currentFamily.getChildren().size();
            if(countFamily < count) sortedList.add(currentFamily);
        }
        return sortedList;

    }
    public int countFamiliesWithMemberNumber(int count){
        int families = 0;
        for (Family9 currFamily : this.collectionFamilyDao9.getAllFamilies()) {
            int familyCount = 0;
            if (currFamily.getFather() != null) familyCount++;
            if (currFamily.getMother() != null) familyCount++;
            familyCount += currFamily.getChildren().size();
            if (familyCount == count) families++;
        }
        return families;

    }
    public boolean createNewFamily(Human9 mother, Human9 father) {
        return this.collectionFamilyDao9.saveFamily(new Family9(mother, father));
    }

    public boolean deleteFamilyByIndex(int index){
        return this.collectionFamilyDao9.deleteFamilyByIndex(index);
    }

    public boolean bornChild(Family9 family9, String fatherName, String motherName){
        if (family9.getMother() == null || family9.getFather() == null) {
            return false;
        }
        Random random = new Random();
        Human9 child;
        int year =  new Date().getYear();
        int iq = (family9.getFather().getIq() + family9.getMother().getIq()) / 2;
        if (random.nextInt(2) == 1) {
            String name = fatherName;
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            child = new Man9(name, family9.getFather().getSurname(), year, iq, null);
        } else {
            String name = motherName;
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            child = new Woman9(name, family9.getFather().getSurname(), year, iq, null);
        }
        family9.addChild(child);
        return true;
    }

    public boolean adoptChild(Family9 family9, Human9 human9) {
        boolean check = false;
        for (Family9 currFamily : this.collectionFamilyDao9.getAllFamilies()) {
            if (family9.equals(currFamily)) {
                currFamily.addChild(human9);
                check = true;
                break;
            }
        }
        return check;
    }

    public void deleteAllChildrenOlderThen(int age) {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
//        for (Family9 family9 : collectionFamilyDao9.getAllFamilies()) {
//            List<Object> newChildrens = new ArrayList<>();
//            for (Human9 human9: family9.getChildren()) {
//                if ((year - human9.getYear()) > age) {
//                    newChildrens.add(human9);
//                }
//            }
//            for (int i = 0; i < newChildrens.size(); i++) {
//                family9.deleteChild(newChildrens.get(i));
//            }
//        }
    }
    public int count(){
        return this.collectionFamilyDao9.getAllFamilies().size();
    }
    public Family9 getFamilyById(int index){
        return this.collectionFamilyDao9.getFamilyByIndex(index);
    }

    public Set<Object> getPets(int index) {
        return this.collectionFamilyDao9.getFamilyByIndex(index).getPets();
    }

    public void addPet(int familyIndex, Pet9 pet9){
        this.collectionFamilyDao9.getFamilyByIndex(familyIndex).addPet(pet9);
    }
    public CollectionFamilyDao9 getFamilyDao() {
        return this.collectionFamilyDao9;
    }

}
