package com;

import java.util.Arrays;


public class Human5 {
    private String name;
    private String surname;
    private int year;
    private int iq;
    public String[][] schedule = new String[7][2];
    private Family family;

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }
    public String[][] getSchedule() {
        return schedule;
    }
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Human5(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human5{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

}
