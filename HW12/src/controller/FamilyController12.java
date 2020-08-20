package controller;

import doa.FamilyDoa12;
import entity.Family12;
import entity.Human12;
import entity.Pet12;
import service.FamilyService12;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

public class FamilyController12 {
    private final FamilyService12 familyService12;
    public FamilyController12(FamilyService12 familyService12) {
        this.familyService12 = familyService12;
    }

    public void displayAllFamilies(){
        this.familyService12.displayAllFamilies();
    }

    public List<Family12> getFamiliesBiggerThan(int count){
        return this.familyService12.getFamiliesBiggerThan(count);

    }
    public  List<Family12> getFamiliesLessThan(int count){
        return this.familyService12.getFamiliesLessThan(count);
    }
    public int countFamiliesWithMemberNumber(int count){
        return this.familyService12.countFamiliesWithMemberNumber(count);
    }
    public boolean createNewFamily(Human12 mother, Human12 father){
        return this.familyService12.createNewFamily(mother, father);
    }
    public boolean deleteFamilyByIndex(int index){
        return this.familyService12.deleteFamilyByIndex(index);
    }

    public void bornChild(Family12 family12, String fatherName, String motherName) throws ParseException {
        this.familyService12.bornChild(family12, fatherName, motherName);
    }
    public boolean adoptChild(Family12 family12, Human12 human12){
        return this.familyService12.adoptChild(family12, human12);

    }
    public void deleteAllChildrenOlderThen(int age){
        this.familyService12.deleteAllChildrenOlderThen(age);
    }
    public int count(){
        return this.familyService12.count();
    }
    public Family12 getFamilyById(int index){
        return this.familyService12.getFamilyById(index);
    }
    public Set<Pet12> getPets(int index){
        return this.familyService12.getPets(index);
    }
    public void addPet(int familyIndex, Pet12 pet12){
        this.familyService12.addPet(familyIndex, pet12);
    }
    public FamilyDoa12 getFamilyDao() {
        return this.familyService12.getFamilyDao();
    }
}
