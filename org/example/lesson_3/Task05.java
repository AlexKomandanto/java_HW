package lesson_3;

import java.util.ArrayList;
import java.util.Scanner;

/*
каталог товаров книжного магазина сохранен в виде двухмерного списка ArrayList<ArrayList<String>>
что на 0-й позиции каждого элемента содержиться название жанра, а на остальных названия книг.
 Напишите метод заполнени данной структуры.
 */
public class Task05 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();

        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("ввведите жанр: ");
            list.get(i).add(sc.nextLine());
            for (int j = 0; j < 5; j++) {
                System.out.println("ввведите название книги: ");
                list.get(i).add(sc.nextLine());
            }
        }

        sc.close();
        System.out.println(list);

    }
}
