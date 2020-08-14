package doa;

import entity.Family9;

import java.util.List;

public interface FamilyDoa9 {

    List<Family9> getAllFamilies();

    Family9 getFamilyByIndex(int index);

    boolean deleteFamily(Family9 family9);

    boolean deleteFamilyByIndex(int index);

    boolean saveFamily(Family9 familyList);

}
