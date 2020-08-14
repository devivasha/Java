package entity;

import java.util.Set;

public class Fish11 extends Pet11 {
    public Species11 species11 = Species11.FISH;

    public Fish11(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }
    @Override
    public void respond() {
        System.out.println("Привет Я рыбка - "+ this.nickname +". Я люблю плавать ");
    }

    @Override
    public String toString() {
        return "Fish8{" +
                "species8=" + species11 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }
}