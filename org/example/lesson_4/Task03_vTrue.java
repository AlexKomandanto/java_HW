package lesson_4;

import java.util.*;
/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки в обратном порядке (первая введённая окажется последней выведенной).
Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class Task03_vTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> deque = new ArrayDeque<>();

        while(true) {
            System.out.println("Введите данные в форме text~num: ");
            String input = sc.nextLine(); // ввод данных пользователем

            if(input.equals("q"))break;

            else if(input.equals("print")){
                System.out.println(deque);  // выводит перевернутый массив, как в условии
            } else if(input.equals("revert")){
                System.out.println(deque.pollFirst()); // удаляет последний доб элем
            } else{
                deque.addFirst(input); // добавляет введеное значение в начало
                                        // (такое добавление усложняет функцию)
            }
            System.out.println(deque);
        }
        sc.close();
    }
}
