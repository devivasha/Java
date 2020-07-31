import com.Family6;
import com.Pet;

import java.util.Arrays;

public class Human7 {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public String[][] schedule = new String[7][2];
    public Family7 family;
    public Pet7 pet7;

    public Pet7 getPet7() { return pet7; }
    public void setPet7(Pet7 pet7) { this.pet7 = pet7; }
    public Family7 getFamily() {
        return family;
    }
    public void setFamily(Family7 family) {
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

    public Human7(String name, String surname, int year, int iq, String[][] schedule, Pet7 pet7) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.pet7 = pet7;
    }
    public void greetPet (){
        System.out.println("Привет, " + pet7.nickname);
    }
    public void describePet (){
        System.out.println("У меня есть " + pet7.nickname+ ", ему "+ pet7.age+ " лет, он " + (pet7.trickLevel >= 50 ? "очень хитрый"  : "почти не хитрый"));
    }

    @Override
    public String toString() {
        return "Human7{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                ", family=" + family +
                ", pet7=" + pet7 +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human7{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}');
    }
}
