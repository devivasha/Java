package entity;

import java.util.HashSet;
import java.util.Set;

public abstract class Pet11 {
    public String nickname;
    public int age;
    public int trickLevel;

    public Set<String> habits = new HashSet<>();
    public Set <String> getHabits() { return habits; }
    public void setHabits(Set<String> habits) { this.habits = habits; }
    private Family11 family9;

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

    public Pet11(){
    }
    public Pet11(String nickname){
        this.nickname = nickname;
    }

    public Pet11(String nickname, int age, int trickLevel, Set<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void  eat () {
        System.out.println("Я кушаю!");
    }
    public abstract void respond ();

    @Override
    public String toString() {
        return "Pet8{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Species {" +
                "nickname=" + this.nickname +
                ", age=" + this.age +
                ", trickLevel=" + this.trickLevel + '\'' +
                ", habits=" + habits + '\''+
                "}");
    }

    public void setFamily(Family11 family9) {
        this.family9 = family9;
    }

}
