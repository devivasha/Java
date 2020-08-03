import java.util.Arrays;
import java.util.Set;

public class Unknown8 extends Pet8{
    public Species8 species8 = Species8.UNKNOWN;

    public Unknown8(String nickname, int age, int trickLevel, Set<String> habits) {
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
