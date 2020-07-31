import com.Species;

import java.util.Arrays;

public class DomesticCat7 extends Pet7 implements Foulable7 {
    public Species7 species7 = Species7.DOMESTICCAT;

    public DomesticCat7(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Привет. Я котяра - "+ this.nickname +". Играй со мной");
    }

    @Override
    public void foul() {
        System.out.println("Какие слаеды о чем вы ????");
    }

    @Override
    public String toString() {
        return "DomesticCat7{" +
                "species7=" + species7 +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

//    @Override
//    public String toString() {
//        return "DomesticCat7{" + '\'' +
//                "species=" + species7 +
//                "nickname='" + nickname + '\'' +
//                ", age=" + age +
//                ", trickLevel=" + trickLevel +
//                ", habits=" + Arrays.toString(habits) +
//                '}';
//    }
}
