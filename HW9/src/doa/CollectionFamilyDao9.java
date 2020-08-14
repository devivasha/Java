package doa;
import entity.Family9;
import entity.Human9;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao9 implements FamilyDoa9 {
    private final List<Family9> families = new ArrayList<>();

    @Override
    public List<Family9> getAllFamilies() {
    return this.families;
    }

    @Override
    public Family9 getFamilyByIndex(int index) {
        return this.families.get(index);

    }


    @Override
    public boolean deleteFamily(Family9 family9) {
        return this.families.remove(family9);

    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        if (index >= this.families.size()){
            return false;
        }
        return this.families.remove(index)!= null;

    }

    @Override
    public boolean saveFamily(Family9 familyList) {
        return false;
    }

    @Override
    public String toString() {
        return "CollectionFamilyDao9{" +
                "families=" + families +
                '}';
    }
}
