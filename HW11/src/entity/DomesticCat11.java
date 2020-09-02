package entity;

import java.util.Set;

public class DomesticCat11 extends Pet13 implements Foulable13 {
    public Species13 species11 = Species13.DOMESTICCAT;

    public DomesticCat11(String nickname, int age, int trickLevel, Set<String> habits) {
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
                "species8=" + species11 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

}
