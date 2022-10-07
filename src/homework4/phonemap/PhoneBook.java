package homework4.phonemap;

import java.util.HashMap;

public class PhoneBook {
    static HashMap<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        add("89822802188", "Романова");
        add("89805462155", "Васильев");
        add("89045561232", "Щукин");
        add("89856545585", "Семенов");
        add("89547852666", "Семенов");
        add("89878548887", "Захарова");
        add("89856456662", "Васильев");


        get("Васильев");
        get("Захарова");
        get("Семенов");
        get("Миронов");
    }

    public static void add(String number, String surname) {
        phoneBook.put(number, surname);
        System.out.println("Вы добавили новый номер: " + number + " - " + surname);
    }

    public static void get(String surname) {
        if (phoneBook.containsValue(surname)) {
            System.out.println("Номера телефонов по фамилии " + surname + ":");
            for (String number : phoneBook.keySet()) {
                if (phoneBook.get(number).equals(surname)) {
                    System.out.println(number);
                }
            }
        }
        else System.out.println("Фамилия " + surname + " не найдена");
    }
}
