package lesson_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
1) Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов

2) Вывести данные по сотрудникам с фамилией Иванов.
 */
public class Task01 {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, String> passportToLastName = new HashMap<Integer, String>();
        passportToLastName.put(123_456, "Иванов");  // add key and value
        passportToLastName.put(321_456, "Васильев");
        passportToLastName.put(234_561, "Петрова");
        passportToLastName.put(234_432, "Иванов");
        passportToLastName.put(654_321, "Петрова");
        passportToLastName.put(345_678, "Иванов");

        System.out.println(passportToLastName);

        String LastName = passportToLastName.get(123_456); // output on key(вывод по ключу)
        System.out.println(LastName);

        if(passportToLastName.containsKey(123_456)){ //вывод по совпадению ключу
            System.out.println("Такой паспорт сохранен в базе!");
        }

        if(passportToLastName.containsValue(" Иванов")){        // вывод по совпадению значения
            System.out.println("Такой ID сохранен в базе!");    // (не рекомендуеться, большое потреб памяти)
        }

        for(Map.Entry<Integer, String> entry: passportToLastName.entrySet()){
            if(entry.getValue().equals("Иванов"))
                System.out.println(entry);
        }
    }
}
