import java.util.Set;

public class Fish8 extends Pet8 {
    public Species8 species8 = Species8.FISH;

    public Fish8(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }
    @Override
    public void respond() {
        System.out.println("Привет Я рыбка - "+ this.nickname +". Я люблю плавать ");
    }

    @Override
    public String toString() {
        return "Fish8{" +
                "species8=" + species8 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }
}
