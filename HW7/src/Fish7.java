import com.Species;

import java.util.Arrays;

public class Fish7 extends Pet7 {
    public Species7 species7 = Species7.FISH;

    public Fish7(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }
    @Override
    public void respond() {
        System.out.println("Привет Я рыбка - "+ this.nickname +". Я люблю плавать ");
    }

    @Override
    public String toString() {
        return "Fish7{" +
                "species7=" + species7 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
