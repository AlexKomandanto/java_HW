package org.example.lesson_3.HW3;

import java.util.ArrayList;

/*
Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */
public class HW02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        list.add(2);
        list.add(123);
        list.add(23);
        list.add(44);
        list.add(345);

        for (int i = 0; i < list.size(); i++) {
            if ( i % 2 == 0){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}
