package entity;

import java.text.ParseException;
import java.util.HashMap;

public final class Woman12 extends Human12 {

    public Woman12(String name, String surname, String birth, int iq, HashMap<String, String> schedule, Pet12 pet12) throws ParseException {
        super(name, surname, birth, iq, schedule, pet12);
    }

    public Woman12(String name, String surname, String birth, int iq) throws ParseException  {
        super(name, surname, birth, iq);
    }

    @Override
    public void greetPet() {
        super.greetPet();
        System.out.println("Давай будем играть");
    }
    public void makeup(){
        System.out.println("Что бы накрасить губы нужна помада");
    }

    @Override
    public String toString() {
        return "Woman8{" +
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
    public String describeAge() {
        return super.describeAge();
    }
}
