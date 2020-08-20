package entity;

import java.text.ParseException;
import java.util.HashMap;

public final class Man12 extends Human12 {

    public Man12(String name, String surname, String birth, int iq, HashMap<String, String> schedule, Pet12 pet12) throws ParseException {
        super(name, surname, birth, iq, schedule, pet12);
    }

    public Man12(String name, String surname, String birth, int iq)  throws ParseException  {
        super(name, surname, birth, iq);
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
                ", pet8=" + pet12 +
                '}';
    }

    @Override
    public String describeAge() {
        return super.describeAge();
    }
}
