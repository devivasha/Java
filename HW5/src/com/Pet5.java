package com;

import java.util.Arrays;

public class Pet5 {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits = {};

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
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

    public Pet5(){
    }
    public Pet5(String species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }
    public Pet5(String species, String nickname, int age, int trickLevel, String [] habits){
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

}
