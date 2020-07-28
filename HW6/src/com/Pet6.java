package com;

import java.util.Arrays;

public class Pet6 {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits = {};

    public Species getSpecies() {
        return species;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }
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

    public Pet6(){
    }
    public Pet6(Species species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }
    public Pet6(Species species, String nickname, int age, int trickLevel, String [] habits){
        this(species, nickname);
        this.age = age;
        this.trickLevel =  trickLevel;
        this.habits = habits;
    }
    public void eat () {
        System.out.println("Я кушаю!");
    }
    public void respond (){
        System.out.println("Привет, хозяин. Я - "+ this.nickname +". Я соскучился!");
    }
    public void foul () {
        System.out.println("Нужно хорошо замести следы...");
    }

    @Override
    public String toString() {
        return this.species + "{" +
                "nickname=" + this.nickname +
                ", age=" + this.age +
                ", trickLevel=" + this.trickLevel + '\'' +
                ", habits=" + Arrays.toString(habits) + '\''+
                "}";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.species + "{" +
                "nickname=" + this.nickname +
                ", age=" + this.age +
                ", trickLevel=" + this.trickLevel + '\'' +
                ", habits=" + Arrays.toString(habits) + '\''+
                "}");
    }

}
