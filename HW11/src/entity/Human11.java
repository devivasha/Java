package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;

public class Human11 {
    public String name;
    public String surname;
    public long birthDate;
    public int iq;
    public HashMap<String, String> schedule = new HashMap<String, String>();
    public Family11 family;
    public Pet11 pet11;

    public Human11(String name, String surname, String birth, int iq, Object o) throws ParseException {
        this.name = name;
        this.surname = surname;
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.birthDate = date.getTime();
        this.iq = iq;
    }

    public Pet11 getPet11() { return pet11; }
    public void setPet11(Pet11 pet8) { this.pet11 = pet8; }
    public Family11 getFamily() {
        return family;
    }
    public void setFamily(Family11 family) {
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
    public long getYear() {
        return birthDate;
    }
    public void setYear(int year) {
        this.birthDate = year;
    }
    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }

    public HashMap<String,String> getSchedule() { return schedule; }

    public void setSchedule(HashMap<String,String> schedule) { this.schedule = schedule; }
    public Human11(String name, String surname, String birth, int iq, HashMap<String,String> schedule, Pet11 pet11) throws ParseException {
        this.name = name;
        this.surname = surname;
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.birthDate = date.getTime();
        this.iq = iq;
        this.schedule = schedule;
        this.pet11 = pet11;
    }
    public void greetPet (){
        System.out.println("Привет, " + pet11.nickname);
    }
    public void describePet (){
        System.out.println("У меня есть " + pet11.nickname+ ", ему "+ pet11.age+ " лет, он " + (pet11.trickLevel >= 50 ? "очень хитрый"  : "почти не хитрый"));
    }

    @Override
    public String toString() {
        return "Human8{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + birthDate +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                ", pet8=" + pet11 +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human8{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + birthDate +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}');
    }
    public String describeAge() {
        LocalDate birthDate = Instant.ofEpochMilli(this.birthDate).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currDate = Instant.ofEpochMilli(new Date().getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(birthDate, currDate);
        return period.getDays() + "- days " + period.getMonths() + "-month " + period.getYears() + "-years ";
    }
}
