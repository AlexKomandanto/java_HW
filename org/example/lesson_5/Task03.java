package lesson_5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь

 */
public class Task03 {
    public static void main(String[] args) {
        printResult1("a+(d*3)");
        printResult1("[a+(1*3)");
        printResult1("[6+(3*3)]");
        printResult1("{a}[+]{(d*3)}");
        printResult1("<{a}+{(d*3)}>");
        printResult1("{a+]}{(d*3)}");
        //System.out.println(isPlaisment("{a+]}{(d*3)}"));
    }

    public static boolean isPlaisment(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> dictionary = new HashMap<>();
        dictionary.put('(', ')');
        dictionary.put('{', '}');
        dictionary.put('<', '>');
        dictionary.put('[', ']');

        for (int i = 0; i < str.length(); i++) {
            if (dictionary.containsKey(str.charAt(i)))
                stack.addFirst(str.charAt(i));     // проверка на символ, закрывающ скобка

            if (dictionary.containsValue(str.charAt(i))) {
                Character openBracket = stack.removeFirst(); // символ окрывающаяся скобка, сохраняем в переменную
                if (!dictionary.get(openBracket).equals(str.charAt(i))) return false;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }

    static void printResult1(String a){
        System.out.println(String.format(
                "%s isPlaisment -> %s", a, isPlaisment(a) ? "true" : "false"));
    }
}
