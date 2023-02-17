package lesson_5.HW5;

import java.util.*;

/*
Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.

 */
public class Task01 {
    public static void main(String[] args) {

    }

    public static void createTelBook (Integer id, String numerical){
        Map<String, ArrayList<String>> telBook = new HashMap<String, ArrayList<String>>();

        //telBook.put("Иванов", createArray.toString());
    }

    public String[] createArray() {
        Scanner sc = new Scanner(System.in);
        int size = 3;
        String[] myArray = new String[size];
        System.out.println("Введите номер телефона: ");
        for(int i=0; i<size; i++) {
            myArray[i] = sc.nextLine();
        }
        return myArray;
    }

//    static void printResult1(String a){
//        System.out.println(String.format(
//                "%s isPlaisment -> %s", a, isPlaisment(a) ? "true" : "false"));
//    }
}
