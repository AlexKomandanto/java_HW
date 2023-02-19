package lesson_4.HW4;
/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

 */

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1234");
        list.add("5678");
        list.add("90-=");
        System.out.println("LinkedList:" + list);
        Iterator a = list.descendingIterator();  // создали итератор

        while (a.hasNext()) { // вывод массива с помощью итератора
            System.out.println("Значение : " + a.next());
        }

        // 2-й вариант решения через коллекции
//        LinkedList<String> list = new LinkedList<>();
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        System.out.println(list);
//
//        Collections.reverse(list);
//
//        System.out.println(list);
    }
}
