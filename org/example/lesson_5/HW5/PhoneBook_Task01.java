package lesson_5.HW5;

import java.util.*;

public class PhoneBook_Task01 {
    private Map<String, List<String>> phoneBook;

    public PhoneBook_Task01() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public void removeContact(String name) {
        phoneBook.remove(name);
    }

    public List<String> getPhones(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public void printContacts() {
        for (String name : phoneBook.keySet()) {
            System.out.println(name + ": " + phoneBook.get(name));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook_Task01 phoneBook = new PhoneBook_Task01();

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add a contact");
            System.out.println("2. Remove a contact");
            System.out.println("3. Get phone numbers for a contact");
            System.out.println("4. Print all contacts");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // символ новой строки

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phone = scanner.nextLine();
                    phoneBook.addContact(name, phone);
                    System.out.println("Contact added!");
                    break;
                case 2:
                    System.out.println("Enter name:");
                    name = scanner.nextLine();
                    phoneBook.removeContact(name);
                    System.out.println("Contact removed!");
                    break;
                case 3:
                    System.out.println("Enter name:");
                    name = scanner.nextLine();
                    List<String> phones = phoneBook.getPhones(name);
                    if (phones.isEmpty()) {
                        System.out.println("No phone numbers found for " + name);
                    } else {
                        System.out.println("Phone numbers for " + name + ": " + phones);
                    }
                    break;
                case 4:
                    phoneBook.printContacts();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again");
                    break;
            }

            System.out.println();
        }
    }
}

