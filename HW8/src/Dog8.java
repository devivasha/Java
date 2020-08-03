import java.util.Arrays;
import java.util.Set;

public class Dog8 extends Pet8 implements Foulable8 {
    public Species8 species8 = Species8.DOG;

    public Dog8(String nickname, int age, int trickLevel, Set<String> habits) {
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
                "species8=" + species8 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

}
