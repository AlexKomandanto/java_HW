package lesson_4;

import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое в цикле:
    Принимает от пользователя строку вида text~num
    Нужно разделить строку по ~, сохранить text в связный список на позицию num.
    Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class Task02 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int size = 3;

        for (int i = 0; i < size; i++) {
            System.out.println("Введите данные в форме text~num: ");
            String str = sc.nextLine();
            String[] parts = str.split("~");
            if (parts[0].equals("print")) {
                String removed = linkedList.remove(Integer.parseInt(parts[1]));
                System.out.println(removed);
            } else {
                linkedList.add(Integer.parseInt(parts[1]), parts[0]);
            }
            System.out.println(linkedList);
        }
        sc.close();
    }

}
