package entity;

import java.util.Set;

public class Dog12 extends Pet12 implements Foulable12 {
    public Species12 species12 = Species12.DOG;

    public Dog12(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }
    @Override
    public void respond() {
        System.out.println("Привет, друг. Я собака- "+ this.nickname +". Покорми меня");
    }

    @Override
    public void foul() {
        System.out.println("Я плохо замел следы...");
    }

    @Override
    public String toString() {
        return "Dog8{" +
                "species8=" + species12 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

}
