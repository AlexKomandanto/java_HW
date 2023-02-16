package lesson_3.randomInt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class randomList {
        public static void main(String[] args) {
            integerComparator ic = new integerComparator();
            Random random = new Random();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(101) - 20; //значения от - 20 до 80
                System.out.println(num);
                list.add(num);
            }

            list.sort(ic);
            System.out.println(list);
        }
    }

