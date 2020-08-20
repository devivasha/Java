package entity;

import java.util.Set;

public class Unknown9 extends Pet9 {
    public Species12 species8 = Species12.UNKNOWN;

    public Unknown9(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Привет, друг. Я неизвестный - "+ this.nickname +". Покорми меня");
    }
    @Override
    public String toString() {
        return "Unknown7{" +
                "species7=" + species8 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }
}
