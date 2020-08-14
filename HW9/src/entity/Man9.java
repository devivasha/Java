package entity;

import java.util.HashMap;

public final class Man9 extends Human9 {

    public Man9(String name, String surname, int year, int iq, HashMap<String, String> schedule, Pet11 pet9) {
        super(name, surname, year, iq, schedule, pet9);
    }

    public Man9(String name, String surname, int year, int iq, Object o) {
        super(name, surname, year, iq, o);
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
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                ", pet8=" + pet8 +
                '}';
    }
}
