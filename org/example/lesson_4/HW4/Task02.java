package lesson_4.HW4;

import java.util.ArrayDeque;
import java.util.Scanner;

/*
    Реализуйте очередь с помощью LinkedList со следующими методами:enqueue()
- помещает элемент в конец очереди, dequeue()
- возвращает первый элемент из очереди и удаляет его, first()
- возвращает первый элемент из очереди, не удаляя.
 */
public class Task02 {
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
