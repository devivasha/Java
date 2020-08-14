import java.text.ParseException;
public class DemoDateTime {
    public static void main(String[] args) throws ParseException {
        Human10 human10 = new Human10("Karol", "Obersi","21/12/2019", 100);
        System.out.println(human10);
        System.out.println(human10.describeAge());
    }
}
