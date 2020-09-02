package doa;
import entity.Family13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao13 implements FamilyDoa13 {
    private final List<Family13> families = new ArrayList<>();

    @Override
    public List<Family13> getAllFamilies() {
    return this.families;
    }

    @Override
    public Family13 getFamilyByIndex(int index) {
        return this.families.get(index);

    }


    @Override
    public boolean deleteFamily(Family13 family13) {
        return this.families.remove(family13);

    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        if (index >= this.families.size()){
            return false;
        }
        return this.families.remove(index)!= null;

    }

    @Override
    public boolean saveFamily(Family13 familyList) {
        return false;
    }
    @Override
    public String toString() {
        return "CollectionFamilyDao9{" +
                "families=" + families +
                '}';
    }

    @Override
    public boolean loadData() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("families.txt"));
        this.families.forEach(family -> {
            try {
                objectOutputStream.writeObject(family);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        objectOutputStream.close();
        System.out.println("Загрузка данных с DB");
        return true;
    }


}
