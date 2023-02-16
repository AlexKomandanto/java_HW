package lesson_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task02_vTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while(true) {
            System.out.println("Введите данные в форме text~num: ");
            String input = sc.nextLine(); // ввод данных пользователем

            String[] text = input.split("~"); //разделяем строку по условию задачи
            if(text[0].equals("q"))break; //завершение программы

            if(text.length < 2){ // проверка на корректность ввода
                System.out.println("Invalid input");
                continue;
           //     throw new IllegalArgumentException("Invalid input");
            }
            int i = Integer.parseInt(text[1]);

            if(text[0].equals("print")){
                System.out.println(list.get(i));
                list.remove(i);
                System.out.println(list);
                continue;
            }

            list.add(i,text[0]);
            System.out.println(list);
        }
        sc.close();
    }
}
