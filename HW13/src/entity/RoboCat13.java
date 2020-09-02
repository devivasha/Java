package entity;

import java.util.Set;

public class RoboCat13 extends Pet13 implements Foulable13 {
    public Species13 species13 = Species13.ROBOCAT;

    public RoboCat13(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Гутен такт. Я робо-кот - "+ this.nickname +". Пошли гулять");
    }
    @Override
    public void foul(){
        System.out.println("Нужно хорошо замести следы...");
    }

    @Override
    public String toString() {
        return "RoboCat8{" +
                "species7=" + species13 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" +habits +
                '}';
    }
}
