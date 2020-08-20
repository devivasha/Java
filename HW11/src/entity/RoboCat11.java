package entity;

import java.util.Set;

public class RoboCat11 extends Pet12 implements Foulable12 {
    public Species12 species11 = Species12.ROBOCAT;

    public RoboCat11(String nickname, int age, int trickLevel, Set<String> habits) {
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
                "species7=" + species11 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" +habits +
                '}';
    }
}
