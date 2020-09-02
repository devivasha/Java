package entity;

import java.util.Set;

public class Unknown13 extends Pet13 {
    public Species13 species13 = Species13.UNKNOWN;

    public Unknown13(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Привет, друг. Я неизвестный - "+ this.nickname +". Покорми меня");
    }
    @Override
    public String toString() {
        return "Unknown7{" +
                "species7=" + species13 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }
}
