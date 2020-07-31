import com.Species;

import java.util.Arrays;

public abstract class Pet7 {
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits = {};

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getTrickLevel() {
        return trickLevel;
    }
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }
    public String[] getHabits() {
        return habits;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public Pet7(){
    }
    public Pet7(String nickname){
        this.nickname = nickname;
    }
    public Pet7(String nickname, int age, int trickLevel, String [] habits){
        this(nickname);
        this.age = age;
        this.trickLevel =  trickLevel;
        this.habits = habits;
    }
    public void  eat () {
        System.out.println("Я кушаю!");
    }
    public abstract void respond ();

    @Override
    public String toString() {
        return "Pet7{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Species {" +
                "nickname=" + this.nickname +
                ", age=" + this.age +
                ", trickLevel=" + this.trickLevel + '\'' +
                ", habits=" + Arrays.toString(habits) + '\''+
                "}");
    }

}
