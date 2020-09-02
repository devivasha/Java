package entity;

import java.util.Set;

public class Fish13 extends Pet13 {
    public Species13 species13 = Species13.FISH;

    public Fish13(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }
    @Override
    public void respond() {
        System.out.println("Привет Я рыбка - "+ this.nickname +". Я люблю плавать ");
    }

    @Override
    public String toString() {
        return "Fish8{" +
                "species8=" + species13 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }
}
