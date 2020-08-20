package doa;

import entity.Family11;
import entity.Family12;

import java.util.List;

public interface FamilyDoa11 {

    List<Family11> getAllFamilies();

    Family11 getFamilyByIndex(int index);

    boolean deleteFamily(Family11 family11);

    boolean deleteFamilyByIndex(int index);

    boolean saveFamily(Family11 familyList);

}
