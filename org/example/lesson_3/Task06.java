package org.example.lesson_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) throws Exception {
        //fillCatalog();
//        System.out.println(fillCatalog(catalog));

    }
    public static void fillCatalog(ArrayList<ArrayList> catalog) {
        catalog.add(new ArrayList(Arrays.asList("Mystery", "Murder on the Orient Express", "The Hound of Baskervilles",
                "The Da Vinci Code", "And Then There Were None", "The Girl on the Train")));
        catalog.add(new ArrayList(Arrays.asList("Romance", "Pride and Prejudice", "Wuthering Heights", "Jane Eyre",
                "The Fault in Our Stars", "Twilight")));
        catalog.add(new ArrayList(Arrays.asList("Science Fiction", "The Hitchhiker's Guide to the Galaxy",
                "The War of the Worlds", "The Martian", "Ready Player One", "Ender's Game"))); }
        //System.out.println(catalog);

    public void printBookstoreProductCatalog (ArrayList<ArrayList> catalog) {
        for (ArrayList row : catalog) {
            String genreName = (String) row.get(0);
            System.out.println("Genre Name: " + genreName);
            for (int i = 1; i<row.size(); i++) {
                System.out.println("Book Name: " + row.get(i));
            }
        }
    }
}
