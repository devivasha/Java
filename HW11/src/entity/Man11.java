package entity;

import java.text.ParseException;
import java.util.HashMap;

public final class Man11 extends Human11 {

    public Man11(String name, String surname, String birth, int iq, HashMap<String, String> schedule, Pet11 pet11) throws ParseException {
        super(name, surname, birth, iq, schedule, pet11);
    }

    public Man11(String name, String surname, String birth, int iq, Object o)  throws ParseException  {
        super(name, surname, birth, iq, o);
    }

    @Override
    public void greetPet() {
        super.greetPet();
        System.out.println("У меня нет времени с тобой гулять");
    }
    public void repairCar(){
        System.out.println("Я запланировал ремонт автомобиля на суботу");
    }

    @Override
    public String toString() {
        return "Man9{" +
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
