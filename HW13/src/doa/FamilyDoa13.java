package doa;

import entity.Family13;

import java.io.IOException;
import java.util.List;

public interface FamilyDoa13 {

    List<Family13> getAllFamilies();

    Family13 getFamilyByIndex(int index);

    boolean deleteFamily(Family13 family13);

    boolean deleteFamilyByIndex(int index);

    boolean saveFamily(Family13 familyList);
    boolean loadData() throws IOException;

}
