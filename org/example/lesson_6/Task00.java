package lesson_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task00 {
    public static void main(String[] args) {
        System.out.println(new HashSet<>(Arrays.asList (6, 5, 1, 2, 3, 2, 4, 6, 5, 3)));

        System.out.println(new TreeSet<>(Arrays.asList (6, 5, 1, 2, 3, 2, 4, 6, 5, 3)));

        System.out.println(new LinkedHashSet<>(Arrays.asList (6, 5, 1, 2, 3, 2, 4, 6, 5, 3)));
    }
}
