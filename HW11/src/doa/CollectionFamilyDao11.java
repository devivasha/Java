package doa;
import entity.Family11;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao11 implements FamilyDoa11 {
    private final List<Family11> families = new ArrayList<>();

    @Override
    public List<Family11> getAllFamilies() {
    return this.families;
    }

    @Override
    public Family11 getFamilyByIndex(int index) {
        return this.families.get(index);

    }


    @Override
    public boolean deleteFamily(Family11 family11) {
        return this.families.remove(family11);

    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        if (index >= this.families.size()){
            return false;
        }
        return this.families.remove(index)!= null;

    }

    @Override
    public boolean saveFamily(Family11 familyList) {
        return false;
    }
    @Override
    public String toString() {
        return "CollectionFamilyDao9{" +
                "families=" + families +
                '}';
    }
}
