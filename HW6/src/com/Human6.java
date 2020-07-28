package com;

import java.util.Arrays;

public class Human6 {
    private String name;
    private String surname;
    private int year;
    private int iq;
    public String[][] schedule = new String[7][2];
    private Family6 family;

    public Family6 getFamily() {
        return family;
    }

    public void setFamily(Family6 family) {
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

    public Human6(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human6{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human6{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}');
    }
}
