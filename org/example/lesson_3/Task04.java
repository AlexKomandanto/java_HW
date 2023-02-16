package lesson_3;

import java.util.ArrayList;
/*
Создать список типа ArrayList<String>()
поместить в него как стороки так целые числа
пройти по списку, найти и удалить целые числа
 */
public class Task04 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>();
        list.add("hello");
        list.add(123);
        list.add("world");
        list.add("987");
        list.add(345);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}
