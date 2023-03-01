package lesson_6.HW6;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

    public class Main {

        public static void main(String[] args) {
            List<Notebook> notebooks = new ArrayList<>();
            notebooks.add(new Notebook("Lenovo", 8, 512, "Windows 10", "Black"));
            notebooks.add(new Notebook("Apple", 16, 1024, "macOS", "Silver"));
            notebooks.add(new Notebook("Dell", 16, 512, "Ubuntu", "Black"));

            filterNotebooks(notebooks);
        }

        public static void filterNotebooks(List<Notebook> notebooks) {
            Map<String, Object> filters = new HashMap<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number corresponding to the required criteria:");
            System.out.println("1 - RAM");
            System.out.println("2 - HDD volume");
            System.out.println("3 - Operating system");
            System.out.println("4 - Color");
            System.out.print("> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter minimum RAM: ");
                    int minRam = scanner.nextInt();
                    filters.put("ram", minRam);
                    break;
                case 2:
                    System.out.print("Enter minimum HDD volume: ");
                    int minHdd = scanner.nextInt();
                    filters.put("hdd", minHdd);
                    break;
                case 3:
                    System.out.print("Enter operating system: ");
                    String os = scanner.next();
                    filters.put("os", os);
                    break;
                case 4:
                    System.out.print("Enter color: ");
                    String color = scanner.next();
                    filters.put("color", color);
                    break;
                default:
                    System.out.println("Invalid filter criteria");
                    return;
            }

            List<Notebook> filteredNotebooks = new ArrayList<>();

            for (Notebook notebook : notebooks) {
                boolean matches = true;

                for (Map.Entry<String, Object> entry : filters.entrySet()) {
                    switch (entry.getKey()) {
                        case "ram":
                            if (notebook.getRam() < (int) entry.getValue()) {
                                matches = false;
                            }
                            break;
                        case "hdd":
                            if (notebook.getHddVolume() < (int) entry.getValue()) {
                                matches = false;
                            }
                            break;
                        case "os":
                            if (!notebook.getOperatingSystem().equalsIgnoreCase((String) entry.getValue())) {
                                matches = false;
                            }
                            break;
                        case "color":
                            if (!notebook.getColor().equalsIgnoreCase((String) entry.getValue())) {
                                matches = false;
                            }
                            break;
                        default:
                            System.out.println("Invalid filter criteria");
                            return;
                    }
                }

                if (matches) {
                    filteredNotebooks.add(notebook);
                }
            }

            System.out.println("Matching notebooks:");
            for (Notebook notebook : filteredNotebooks) {
                System.out.println(notebook.getBrand() + " - " + notebook.getOperatingSystem() + " - " + notebook.getColor());
            }
        }
    }
    
