package entity;

import java.util.HashMap;

public final class Woman9 extends Human9 {
    public Woman9(String name, String surname, int year, int iq, HashMap<String, String> schedule, Pet11 pet8) {
        super(name, surname, year, iq, schedule, pet8);
    }

    public Woman9(String name, String surname, int year, int iq, Object o) {
        super(name, surname, year, iq, o);
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
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                ", pet8=" + pet8 +
                '}';
    }
}
