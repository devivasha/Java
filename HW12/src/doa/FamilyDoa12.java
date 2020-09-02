package doa;

import entity.Family12;
import entity.Family13;

import java.util.List;

public interface FamilyDoa12 {

    List<Family12> getAllFamilies();

    Family12 getFamilyByIndex(int index);

    boolean deleteFamily(Family12 family12);

    boolean deleteFamilyByIndex(int index);

    boolean saveFamily(Family12 familyList);

}
