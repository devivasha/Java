package entity;

import java.text.ParseException;
import java.util.HashMap;

public final class Woman11 extends Human11 {

    public Woman11(String name, String surname, String birth, int iq, HashMap<String, String> schedule, Pet11 pet11) throws ParseException {
        super(name, surname, birth, iq, schedule, pet11);
    }

    public Woman11(String name, String surname, String birth, int iq, HashMap<String, String> schedule, Object o) throws ParseException {
        super(name, surname, birth, iq, o);
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
                ", pet8=" + pet11 +
                '}';
    }

    @Override
    public String describeAge() {
        return super.describeAge();
    }
}
