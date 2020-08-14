package controller;
import entity.Family9;
import entity.Family9;
import entity.Human9;
import doa.FamilyDoa9;
import entity.Pet9;
import service.FamilyService9;

import java.util.List;
import java.util.Set;

public class FamilyController9 {
    private final FamilyService9 familyService9;
    public FamilyController9(FamilyService9 familyService9) {
        this.familyService9 = familyService9;
    }

    public void displayAllFamilies(){
        this.familyService9.displayAllFamilies();
    }

    public List<Family9> getFamiliesBiggerThan(int count){
        return this.familyService9.getFamiliesBiggerThan(count);

    }
    public  List<Family9> getFamiliesLessThan(int count){
        return this.familyService9.getFamiliesLessThan(count);
    }
    public int countFamiliesWithMemberNumber(int count){
        return this.familyService9.countFamiliesWithMemberNumber(count);
    }
    public boolean createNewFamily(Human9 mother, Human9 father){
        return this.familyService9.createNewFamily(mother, father);
    }
    public boolean deleteFamilyByIndex(int index){
        return this.familyService9.deleteFamilyByIndex(index);
    }

    public void bornChild(Family9 family9, String fatherName, String motherName){
        this.familyService9.bornChild(family9, fatherName, motherName);
    }
    public boolean adoptChild(Family9 family9, Human9 human9){
        return this.familyService9.adoptChild(family9, human9);

    }
    public void deleteAllChildrenOlderThen(int age){
        this.familyService9.deleteAllChildrenOlderThen(age);
    }
    public int count(){
        return this.familyService9.count();
    }
    public Family9 getFamilyById(int index){
        return this.familyService9.getFamilyById(index);
    }
    public Set<Object> getPets(int index){
        return this.familyService9.getPets(index);
    }
    public void addPet(int familyIndex, Pet9 pet9){
        this.familyService9.addPet(familyIndex, pet9);
    }
    public FamilyDoa9 getFamilyDao() {
        return this.familyService9.getFamilyDao();
    }
}
