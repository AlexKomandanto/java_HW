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

    }
    private LinkedList<Object> list;

    public void LinkedQueue() {
        list = new LinkedList<Object>();
    }

    public void enqueue(Object element) {
        list.addLast(element);
    }

    public Object dequeue() {
        if (list.isEmpty()) {
            return null;
        }

        Object element = list.getFirst();
        list.removeFirst();
        return element;
    }

    public Object first() {
        if (list.isEmpty()) {
            return null;
        }

        return list.getFirst();
    }
}
