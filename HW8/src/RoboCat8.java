import java.util.Set;

public class RoboCat8 extends Pet8 implements Foulable8 {
    public Species8 species8 = Species8.ROBOCAT;

    public RoboCat8(String nickname, int age, int trickLevel, Set<String> habits) {
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
                "species7=" + species8 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" +habits +
                '}';
    }
}
