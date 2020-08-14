import entity.Foulable11;

import java.util.Arrays;

public class RoboCat7 extends Pet7 implements Foulable11 {
    public Species7 species7 = Species7.ROBOCAT;

    public RoboCat7(String nickname, int age, int trickLevel, String[] habits) {
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
        return "RoboCat7{" +
                "species7=" + species7 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
