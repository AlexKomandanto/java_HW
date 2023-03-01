package lesson_5.HW5;
/*
Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
 */

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        String[] employees = {"Ivan", "Peter", "Anton", "Ivan", "Olga", "Peter", "Maria", "Maria", "Ivan", "Helga"};

        // Create a HashMap to store the count of each name
        Map<String, Integer> nameCount = new HashMap<>();

        // Count the number of occurrences of each name
        for (String name : employees) {
            if (nameCount.containsKey(name)) {
                nameCount.put(name, nameCount.get(name) + 1);
            } else {
                nameCount.put(name, 1);
            }
        }

        // Create a list of entries in the HashMap
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(nameCount.entrySet());

        // Sort the list of entries by count in descending order
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });

        // Print out the list of duplicate names and their counts
        System.out.println("Duplicate Names:");
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " occurrences");
            }
        }
    }
}
