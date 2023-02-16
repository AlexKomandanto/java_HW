package lesson_3.randomInt;

import java.util.Comparator;

public class integerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2; // значения от меньшего, для изменения поменять местами
    }
}
