package entity;

import java.util.HashSet;
import java.util.Set;

public abstract class Pet12 {
    public String nickname;
    public int age;
    public int trickLevel;

    public Set<String> habits = new HashSet<>();
    public Set <String> getHabits() { return habits; }
    public void setHabits(Set<String> habits) { this.habits = habits; }
    private Family12 family12;

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

    public Pet12(){
    }
    public Pet12(String nickname){
        this.nickname = nickname;
    }

    public Pet12(String nickname, int age, int trickLevel, Set<String> habits) {
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

    public void setFamily(Family12 family12) {
        this.family12 = family12;
    }

    public String prettyFormat() {
        StringBuilder str = new StringBuilder();
        str.append("species=")
                .append(", nickname='")
                .append(this.nickname)
                .append("', age=")
                .append(this.age)
                .append(", habits=")
                .append(this.habits);
        return null;
    }



}
