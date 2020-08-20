package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;

public class Human12 {
    public String name;
    public String surname;
    public long birthDate;
    public int iq;
    public HashMap<String, String> schedule = new HashMap<String, String>();
    public Family12 family;
    public Pet12 pet12;

    public Human12(String name, String surname, String birth, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.birthDate = date.getTime();
        this.iq = iq;
    }

    public Pet12 getPet12() { return pet12; }
    public void setPet12(Pet12 pet8) { this.pet12 = pet8; }
    public Family12 getFamily() {
        return family;
    }
    public void setFamily(Family12 family) {
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
    public Human12(String name, String surname, String birth, int iq, HashMap<String,String> schedule, Pet12 pet12) throws ParseException {
        this.name = name;
        this.surname = surname;
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birth);
        this.birthDate = date.getTime();
        this.iq = iq;
        this.schedule = schedule;
        this.pet12 = pet12;
    }
    public void greetPet (){
        System.out.println("Привет, " + pet12.nickname);
    }
    public void describePet (){
        System.out.println("У меня есть " + pet12.nickname+ ", ему "+ pet12.age+ " лет, он " + (pet12.trickLevel >= 50 ? "очень хитрый"  : "почти не хитрый"));
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
                ", pet8=" + pet12 +
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

    public String prettyFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String birthDateToString = simpleDateFormat.format(new Date(this.birthDate));
        StringBuilder str = new StringBuilder();
        str.append("{name='")
                .append(this.name)
                .append("', surname='")
                .append(this.surname)
                .append("', birthDate='")
                .append(birthDateToString)
                .append("', iq=")
                .append(this.iq)
                .append(", schedule=")
                .append(this.schedule)
                .append("}");
        return str.toString();

    }
}
