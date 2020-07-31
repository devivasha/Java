import java.util.Arrays;

final class Man7 extends Human7 {
    public Man7(String name, String surname, int year, int iq, String[][] schedule, Pet7 pet7) {
        super(name, surname, year, iq, schedule, pet7);
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
        return "Man7{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                ", family=" + family +
                ", pet7=" + pet7 +
                '}';
    }
}
