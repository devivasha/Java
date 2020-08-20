package console;

import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import controller.FamilyController12;
import doa.CollectionFamilyDao12;
import entity.*;
import service.FamilyService12;

public class ConsoleMenu {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        boolean stopProgram = false;
        while (!stopProgram) {
            printMenuItems();
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    safeCall(ConsoleMenu::filedDB, scanner);
                    break;
                case "2":
                    safeCall(ConsoleMenu::listFamilies, scanner);
                    break;
                case "3":
                    safeCall(ConsoleMenu::listFamiliesQtyHigher, scanner);
                    break;
                case "4":
                    safeCall(ConsoleMenu::listFamiliesQtyLower, scanner);
                    break;
                case "5":
                    safeCall(ConsoleMenu::countFamiliesByMambers, scanner);
                    break;
                case "6":
                    safeCall(ConsoleMenu::createNewFamily, scanner);
                    break;
                case "7":
                    safeCall(ConsoleMenu::deleteFamily, scanner);
                    break;
                case "8":
                    printSubMenuItems();
                    String userSelect = scanner.nextLine();
                    switch (userSelect) {
                        case "1":
                            safeCall(ConsoleMenu::bornChild, scanner);
                            break;
                        case "2":
                            safeCall(ConsoleMenu::addoptChild, scanner);
                            break;
                        case "3":
                            break;
                        default:
                            System.out.println("Неизвестная команда");
                    }
                    break;
                case "9":
                    safeCall(ConsoleMenu::deleteChild, scanner);
                    break;
                case "10":
                    stopProgram = true;
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }
    private static void safeCall(Consumer<Scanner> consumer, Scanner scanner) {
        try {
            consumer.accept(scanner);
        } catch (Exception e) {
            System.err.printf("Произошла ошибка: %s%n", e.getMessage());
        }
    }

    private static void printMenuItems() {
        System.out.println("Введите команду");
        System.out.println("1. Заполнить тестовыми данными");
        System.out.println("2. Отобразить весь список семей");
        System.out.println("3. Cписок семей, где количество людей больше");
        System.out.println("4. Cписок семей, где количество людей меньше");
        System.out.println("5. Подсчитать количество семей, где количество членов равно");
        System.out.println("6. Создать новую семью");
        System.out.println("7. Удалить семью по индексу");
        System.out.println("8. Редактировать семью по индексу");
        System.out.println("9. Удалить всех детей старше возраста");
        System.out.println("10. Выход");
    }
    private static void printSubMenuItems() {
        System.out.println("1. Родить ребенка");
        System.out.println("2. Усыновить ребенка");
        System.out.println("3. Вернуться в главное меню");
    }


    private static <T> T readTyped(Scanner scanner, Function<String, T> func, String errMessage) {
        T tValue = null;

        do {
            String input = scanner.nextLine();

            try {
                tValue = func.apply(input);
            } catch (Exception e) {
                System.out.println(errMessage);
            }
        } while (tValue == null);

        return tValue;
    }

    private static void filedDB(Scanner scanner) {
        CollectionFamilyDao12 collectionFamilyDao12 = new CollectionFamilyDao12();
        FamilyService12 familyService12 = new FamilyService12(collectionFamilyDao12);
        FamilyController12 familyController12 = new FamilyController12(familyService12);
        Dog12 dog12 = new Dog12("Jeck", 5, 50, new HashSet<>(2));
        dog12.habits.add("run");
        dog12.habits.add("dance");
        try {
            familyController12.createNewFamily(new Woman12("Olga", "GGGGG", "23/12/1999",50, new HashMap<String, String>(), dog12), new Man12("Bob", "GGGGG", "23/01/1999",80, new HashMap<String, String>(), dog12));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            familyController12.createNewFamily(new Woman12("Nana", "BBBBB", "23/10/1999",50, new HashMap<String, String>(), dog12), new Man12("Bil", "BBBBB","23/03/1999",80, new HashMap<String, String>(), dog12));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            familyController12.createNewFamily(new Woman12("Bene", "CCCCC", "23/10/1999",50, new HashMap<String, String>(), dog12), new Man12("George", "CCCCC","23/03/1999",80, new HashMap<String, String>(), dog12));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Семьи созданны");
    }

    private static void listFamilies(Scanner scanner) {
        CollectionFamilyDao12 collectionFamilyDao12 = new CollectionFamilyDao12();
        FamilyService12 familyService12 = new FamilyService12(collectionFamilyDao12);
        FamilyController12 familyController12 = new FamilyController12(familyService12);
        familyController12.displayAllFamilies();
        System.out.println("Cписок семей");
    }

    private static void listFamiliesQtyHigher(Scanner scanner) {
        CollectionFamilyDao12 collectionFamilyDao12 = new CollectionFamilyDao12();
        FamilyService12 familyService12 = new FamilyService12(collectionFamilyDao12);
        FamilyController12 familyController12 = new FamilyController12(familyService12);
        System.out.println("Введите количество людей");
        Integer personeQtyBiger = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Cписок семей где количество людей больше чем :" + personeQtyBiger + "");
        familyController12.getFamiliesBiggerThan(personeQtyBiger).forEach(f -> System.out.println(f.prettyFormat()));
    }

    private static void listFamiliesQtyLower(Scanner scanner) {
        CollectionFamilyDao12 collectionFamilyDao12 = new CollectionFamilyDao12();
        FamilyService12 familyService12 = new FamilyService12(collectionFamilyDao12);
        FamilyController12 familyController12 = new FamilyController12(familyService12);
        System.out.println("Введите количество людей");
        Integer personeQtyLower = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Cписок семей где количество людей меньше чем :" + personeQtyLower + "");
        familyController12.getFamiliesLessThan(personeQtyLower).forEach(f -> System.out.println(f.prettyFormat()));
    }

    private static void countFamiliesByMambers(Scanner scanner) {
        CollectionFamilyDao12 collectionFamilyDao12 = new CollectionFamilyDao12();
        FamilyService12 familyService12 = new FamilyService12(collectionFamilyDao12);
        FamilyController12 familyController12 = new FamilyController12(familyService12);
        System.out.println("Введите количество людей");
        Integer membersQty = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Колличество семей, где количество членов равно :" + membersQty + "");
        System.out.println(familyController12.countFamiliesWithMemberNumber(membersQty));
    }

    private static void createNewFamily(Scanner scanner) {
        CollectionFamilyDao12 collectionFamilyDao12 = new CollectionFamilyDao12();
        FamilyService12 familyService12 = new FamilyService12(collectionFamilyDao12);
        FamilyController12 familyController12 = new FamilyController12(familyService12);
        System.out.println("Имя матери");
        String motherName = readTyped(scanner, String::valueOf, "Не строка, попробуйте еще раз");
        System.out.println("Фамилию матери");
        String motherSurname = readTyped(scanner, String::valueOf, "Не строка, попробуйте еще раз");
        System.out.println("Год рождения матери");
        Integer birthYear = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Месяц рождения матери");
        Integer birthMonth = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("День рождения матери");
        Integer birthDay = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("IQ матери");
        Integer motherIq = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        String motherBirth = birthDay + "/" + birthMonth + "/" + birthYear;
        Human12 mother = null;
        try {
            mother = new Woman12(motherName, motherSurname, motherBirth, motherIq);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Имя отца");
        String fatherName = readTyped(scanner, String::valueOf, "Не строка, попробуйте еще раз");
        System.out.println("Фамилию отца");
        String fatherSurname = readTyped(scanner, String::valueOf, "Не строка, попробуйте еще раз");
        System.out.println("Год рождения отца");
        Integer fatherYear = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Месяц рождения отца");
        Integer fatherBirthMonth = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("День рождения отца");
        Integer fatherBirthDay = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("IQ отца");
        Integer fatherIq = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println(" Мама: Имя" + motherName + "Фамилия " + motherSurname + "День " + birthDay + "Месяць " + birthMonth + "Год " + birthYear + "IQ " + motherIq + " " +
                " Папа: Имя" + fatherName + "Фамилия " + fatherSurname + "День " + fatherBirthDay + "Месяць " + fatherBirthMonth + "Год " + fatherYear + "IQ " + fatherIq + " ");
        String fatherBirth = fatherBirthDay + "/" + fatherBirthMonth + "/" + fatherYear;
        Human12 father = null;
        try {
            father = new Man12(fatherName, fatherSurname, fatherBirth, fatherIq);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        familyController12.createNewFamily(mother, father);
    }
    private static void deleteFamily (Scanner scanner) {
        CollectionFamilyDao12 collectionFamilyDao12 = new CollectionFamilyDao12();
        FamilyService12 familyService12 = new FamilyService12(collectionFamilyDao12);
        FamilyController12 familyController12 = new FamilyController12(familyService12);
        System.out.println("Введите порядковый номер семьи");
        Integer familyId = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Удаленна семья № :" + familyId + " ");
        familyController12.deleteFamilyByIndex(familyId);
    }
    private static void deleteChild(Scanner scanner) {
        CollectionFamilyDao12 collectionFamilyDao12 = new CollectionFamilyDao12();
        FamilyService12 familyService12 = new FamilyService12(collectionFamilyDao12);
        FamilyController12 familyController12 = new FamilyController12(familyService12);
        System.out.println("Введите возраст");
        Integer childAgeToDelete = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        familyController12.deleteAllChildrenOlderThen(childAgeToDelete);
        System.out.println("Удаленны дети старше :" + childAgeToDelete + " ");
    }
    private static void  bornChild(Scanner scanner) {
        CollectionFamilyDao12 collectionFamilyDao12 = new CollectionFamilyDao12();
        FamilyService12 familyService12 = new FamilyService12(collectionFamilyDao12);
        FamilyController12 familyController12 = new FamilyController12(familyService12);
        System.out.println("Введите  порядковый номер семьи");
        Integer familyId = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Введите имя девочки ");
        String girlName = readTyped(scanner, String::valueOf, "Не строка, попробуйте еще раз");
        System.out.println("Введите имя мальчика ");
        String boyName = readTyped(scanner, String::valueOf, "Не строка, попробуйте еще раз");
        System.out.println("Родилась: " + familyId +" "+ boyName + " " + girlName);
        try {
            familyController12.bornChild(familyController12.getFamilyById(familyId), boyName, girlName);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    private static void addoptChild (Scanner scanner) {
        CollectionFamilyDao12 collectionFamilyDao12 = new CollectionFamilyDao12();
        FamilyService12 familyService12 = new FamilyService12(collectionFamilyDao12);
        FamilyController12 familyController12 = new FamilyController12(familyService12);
        System.out.println("Введите  порядковый номер семьи");
        Integer familyId = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Введите имя ребенка ");
        String childName = readTyped(scanner, String::valueOf, "Не строка, попробуйте еще раз");
        System.out.println("Введите Фамилию ребенка");
        String childSurname = readTyped(scanner, String::valueOf, "Не строка, попробуйте еще раз");
        System.out.println("Введите Год рождения ребенка");
        Integer childYear = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Введите Месяц рождения ребенка");
        Integer childBirthMonth = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Введите День рождения ребенка");
        Integer childBirthDay = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Введите IQ ребенка");
        Integer childIq = readTyped(scanner, Integer::parseInt, "Не число, попробуйте еще раз");
        System.out.println("Усыновили/ Удочерили :" + familyId +" "+ childName +" "+ childSurname +" "+ childBirthDay +" "+ childBirthMonth +" "+ childYear +" "+ childIq);
        String birthDaySum = childBirthDay + "/" + childBirthMonth + "/" + childYear;
        Human12 child = null;
        try {
            child = new Man12(childName, childSurname, birthDaySum, childIq);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        familyController12.adoptChild(familyController12.getFamilyById(familyId), child);
    }
}

