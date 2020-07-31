import java.util.Arrays;

final class Woman7 extends Human7 {
    public Woman7(String name, String surname, int year, int iq, String[][] schedule, Pet7 pet7) {
        super(name, surname, year, iq, schedule, pet7);
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
        return "Woman7{" +
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
