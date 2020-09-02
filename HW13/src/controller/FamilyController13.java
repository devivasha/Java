package controller;

import doa.FamilyDoa13;
import entity.Family13;
import entity.Human13;
import entity.Pet13;
import service.FamilyService13;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Set;

public class FamilyController13 {
    private final FamilyService13 familyService13;
    public FamilyController13(FamilyService13 familyService13) {
        this.familyService13 = familyService13;
    }

    public void displayAllFamilies(){
        this.familyService13.displayAllFamilies();
    }

    public List<Family13> getFamiliesBiggerThan(int count){
        return this.familyService13.getFamiliesBiggerThan(count);

    }
    public  List<Family13> getFamiliesLessThan(int count){
        return this.familyService13.getFamiliesLessThan(count);
    }
    public int countFamiliesWithMemberNumber(int count){
        return this.familyService13.countFamiliesWithMemberNumber(count);
    }
    public boolean createNewFamily(Human13 mother, Human13 father){
        return this.familyService13.createNewFamily(mother, father);
    }
    public boolean deleteFamilyByIndex(int index){
        return this.familyService13.deleteFamilyByIndex(index);
    }

    public void bornChild(Family13 family12, String fatherName, String motherName) throws ParseException {
        this.familyService13.bornChild(family12, fatherName, motherName);
    }
    public boolean adoptChild(Family13 family12, Human13 human12){
        return this.familyService13.adoptChild(family12, human12);

    }
    public void deleteAllChildrenOlderThen(int age){
        this.familyService13.deleteAllChildrenOlderThen(age);
    }
    public int count(){
        return this.familyService13.count();
    }
    public Family13 getFamilyById(int index){
        return this.familyService13.getFamilyById(index);
    }
    public Set<Pet13> getPets(int index){
        return this.familyService13.getPets(index);
    }
    public void addPet(int familyIndex, Pet13 pet12){
        this.familyService13.addPet(familyIndex, pet12);
    }
    public FamilyDoa13 getFamilyDao() {
        return this.familyService13.getFamilyDao();
    }
    public boolean loadData() {
        try {
            return this.familyService13.loadData();
        } catch (IOException e) {
            System.out.println("Загрузка данных: " + e.getMessage());
            return false;
        }
    }
    public boolean uploadFamilies() {
        try {
            return this.familyService13.uploadFamilies();
        } catch (Exception e) {
           System.out.println(e.getMessage());
            System.out.println("Выгрузка данных: " + e.getMessage());
            return false;
        }
    }


}
