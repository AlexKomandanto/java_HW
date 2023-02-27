package lesson_5.HW5;

import java.util.*;

/*
Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.

 */
public class Task01 {
    public static void main(String[] args) {
        //HashMap<String, List<String, String>> phoneBook = createArray(addPerson(), addPhone());

    }

    public static void createTelBook (Integer id, String numerical){
        //Map<String, ArrayList<String, String>> phoneBook = new HashMap<String, ArrayList<String>>();

        //phoneBook.put("Иванов", createArray());
        //HashMap<String, List<String, String>> phoneBook = new HashMap<>();

// Add a person with a single number
        //phoneBook.put("John Doe", Arrays.asList("123-456-7890"));

// Add a person with multiple numbers
        //phoneBook.put("Jane Doe", Arrays.asList("123-456-7890", "098-765-4321"));
        //phoneBook.put("Иванов", createArray());
    }

    public List<String> createArray(String number) {
        Scanner sc = new Scanner(System.in);
        int size = 3;
        String[] myArray = new String[size];
        System.out.println("Введите номер телефона: ");
        for(int i=0; i<size; i++) {
            myArray[i] = sc.nextLine();
        }
        return List.of(myArray);
    }
//
//    public HashMap<String, List<Integer, Integer>> phoneBook = new HashMap<>();
//    // Add a person to the phone book
//    public void addPerson(String name) {
//        List<Integer> phones = new ArrayList<>();
//        int randomNum = (int) (Math.random() * 100);
//        phones.add(randomNum);
//        phoneBook.put(name, phones);
//    }
//
//    // Add a phone number to an existing person
//    public void addPhone(String name, int phoneNum) {
//        if (phoneBook.containsKey(name)) {
//            List<Integer> phones = phoneBook.get(name);
//            phones.add(phoneNum);
//        }
//    }
//    static void printResult1(String a){
//        System.out.println(String.format(
//                "%s isPlaisment -> %s", a, isPlaisment(a) ? "true" : "false"));
//    }
}
