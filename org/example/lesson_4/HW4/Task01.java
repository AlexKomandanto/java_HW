package lesson_4.HW4;
/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

 */

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        //descendingIterator(list);
        list.add("abcd");
        list.add("efgh");
        list.add("lkmn");
        System.out.println(list);
        Iterator a = list.descendingIterator();  // создали итератор

        LinkedList<String> listRevers = new LinkedList<>();

        while (a.hasNext()) { // вывод массива с помощью итератора
            //System.out.println(a.next());
            //LinkedList<String> listRevers = new LinkedList<>();
            listRevers.addFirst((String) a.next());
            //System.out.println(listRevers);
        }
        System.out.println(listRevers);
    }
}
