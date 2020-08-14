package entity;

import java.util.HashMap;

public class Human9 {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public HashMap<String, String> schedule = new HashMap<String, String>();
    public Family9 family;
    public Pet11 pet8;

    public Human9(String name, String surname, int year, int iq, Object o) {
    }

    public Pet11 getPet8() { return pet8; }
    public void setPet8(Pet11 pet8) { this.pet8 = pet8; }
    public Family9 getFamily() {
        return family;
    }
    public void setFamily(Family9 family) {
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

    public HashMap<String,String> getSchedule() { return schedule; }

    public void setSchedule(HashMap<String,String> schedule) { this.schedule = schedule; }
    public Human9(String name, String surname, int year, int iq, HashMap<String,String> schedule, Pet11 pet8) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.pet8 = pet8;
    }
    public void greetPet (){
        System.out.println("Привет, " + pet8.nickname);
    }
    public void describePet (){
        System.out.println("У меня есть " + pet8.nickname+ ", ему "+ pet8.age+ " лет, он " + (pet8.trickLevel >= 50 ? "очень хитрый"  : "почти не хитрый"));
    }

    @Override
    public String toString() {
        return "Human8{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                ", pet8=" + pet8 +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human8{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}');
    }
}
