package com;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits = {};
    public Pet(){
    }
    public Pet (String species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }
    public Pet (String species, String nickname, int age, int trickLevel, String [] habits){
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
