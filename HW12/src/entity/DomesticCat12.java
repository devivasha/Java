package entity;

import java.util.Set;

public class DomesticCat12 extends Pet12 implements Foulable12 {
    public Species12 species12 = Species12.DOMESTICCAT;

    public DomesticCat12(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Привет. Я котяра - "+ this.nickname +". Играй со мной");
    }

    @Override
    public void foul() {
        System.out.println("Какие слаеды о чем вы ????");
    }

    @Override
    public String toString() {
        return "DomesticCat8{" +
                "species8=" + species12 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

}
