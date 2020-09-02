import entity.Foulable13;

import java.util.Arrays;

public class Dog7 extends Pet7 implements Foulable13 {
    public Species7 species7 = Species7.DOG;

    public Dog7(String nickname, int age, int trickLevel, String[] habits) {
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
        return "Dog7{" +
                "species7=" + species7 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

}
