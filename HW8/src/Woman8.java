import java.util.Arrays;
import java.util.HashMap;

final class Woman8 extends Human8 {
    public Woman8(String name, String surname, int year, int iq, HashMap<String, String> schedule, Pet8 pet8) {
        super(name, surname, year, iq, schedule, pet8);
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
