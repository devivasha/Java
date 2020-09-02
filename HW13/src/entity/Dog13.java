package entity;

import java.util.Set;

public class Dog13 extends Pet13 implements Foulable13 {
    public Species13 species13 = Species13.DOG;

    public Dog13(String nickname, int age, int trickLevel, Set<String> habits) {
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
                "species8=" + species13 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

}
