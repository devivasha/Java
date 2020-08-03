import java.util.Arrays;
import java.util.HashMap;

final class Man8 extends Human8 {

    public Man8(String name, String surname, int year, int iq, HashMap<String, String> schedule, Pet8 pet8) {
        super(name, surname, year, iq, schedule, pet8);
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
        return "Man8{" +
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
