package lesson_4.HW4;

import java.util.LinkedList;

/*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue()- помещает элемент в конец очереди,
    dequeue()- возвращает первый элемент из очереди и удаляет его,
    first()- возвращает первый элемент из очереди, не удаляя.
 */
public class Task02 {
    public static void main(String[] args) {
        LinkedQueue();
        enqueue("svf");
        enqueue("hive");
        enqueue("kqa");
        System.out.println(list);
        dequeue();
        System.out.println(list);
        enqueue("svf");
        System.out.println(list);
        System.out.println(first());

    }

    private static LinkedList<String> list;

    public static void LinkedQueue() {
        list = new LinkedList<String>();
    }

    // помещает элемент в конец очереди List
    public static void enqueue(String element) {
        list.addLast(element);
    }

    // метод возвращает первый элемент из очереди и удаляет его, если List не пустой
    public static String dequeue() {
        if (list.isEmpty()) {
            return null;
        }

        String element = list.getFirst();
        list.removeFirst();
        return element;
    }

    // метод возвращает первый элемент из очереди, не удаляя
    public static String first() {
        if (list.isEmpty()) {
            return null;
        }

        return list.getFirst();
    }
}
