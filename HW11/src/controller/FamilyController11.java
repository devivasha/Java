package controller;

import doa.FamilyDoa11;
import entity.Family11;
import entity.Human11;
import entity.Pet11;
import service.FamilyService11;
import service.FamilyService11;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

public class FamilyController11 {
    private final FamilyService11 familyService11;
    public FamilyController11(FamilyService11 familyService11) {
        this.familyService11 = familyService11;
    }

    public void displayAllFamilies(){
        this.familyService11.displayAllFamilies();
    }

    public List<Family11> getFamiliesBiggerThan(int count){
        return this.familyService11.getFamiliesBiggerThan(count);

    }
    public  List<Family11> getFamiliesLessThan(int count){
        return this.familyService11.getFamiliesLessThan(count);
    }
    public int countFamiliesWithMemberNumber(int count){
        return this.familyService11.countFamiliesWithMemberNumber(count);
    }
    public boolean createNewFamily(Human11 mother, Human11 father){
        return this.familyService11.createNewFamily(mother, father);
    }
    public boolean deleteFamilyByIndex(int index){
        return this.familyService11.deleteFamilyByIndex(index);
    }

    public void bornChild(Family11 family11, String fatherName, String motherName) throws ParseException {
        this.familyService11.bornChild(family11, fatherName, motherName);
    }
    public boolean adoptChild(Family11 family11, Human11 human11){
        return this.familyService11.adoptChild(family11, human11);

    }
    public void deleteAllChildrenOlderThen(int age){
        this.familyService11.deleteAllChildrenOlderThen(age);
    }
    public int count(){
        return this.familyService11.count();
    }
    public Family11 getFamilyById(int index){
        return this.familyService11.getFamilyById(index);
    }
    public Set<Object> getPets(int index){
        return this.familyService11.getPets(index);
    }
    public void addPet(int familyIndex, Pet11 pet11){
        this.familyService11.addPet(familyIndex, pet11);
    }
    public FamilyDoa11 getFamilyDao() {
        return this.familyService11.getFamilyDao();
    }
}
