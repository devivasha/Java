package doa;
import entity.Family12;


import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao12 implements FamilyDoa12 {
    private final List<Family12> families = new ArrayList<>();

    @Override
    public List<Family12> getAllFamilies() {
    return this.families;
    }

    @Override
    public Family12 getFamilyByIndex(int index) {
        return this.families.get(index);

    }
    @Override
    public boolean deleteFamily(Family12 family12) {
        return this.families.remove(family12);
    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        if (index >= this.families.size()){
            return false;
        }
        return this.families.remove(index)!= null;

    }

    @Override
    public boolean saveFamily(Family12 familyList) {
        return false;
    }
    @Override
    public String toString() {
        return "CollectionFamilyDao9{" +
                "families=" + families +
                '}';
    }
}
