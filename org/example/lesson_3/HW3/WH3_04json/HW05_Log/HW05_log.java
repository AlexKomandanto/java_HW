package lesson_3.HW3.WH3_04json.HW05_Log;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HW05_log {
    public static void main(String[] args) throws Exception {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        eachOtherSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void eachOtherSort(int[] numbers){
        Logger logger = Logger.getLogger(HW05_log.class.getName());

        for(int i=0; i < numbers.length; i++){
            logger.log(Level.INFO, String.format("i = %d", i));
            for(int j=0; j < numbers.length; j++){
                logger.log(Level.INFO, String.format("j = %d", j));
                logger.log(Level.INFO, String.format("need to swap? = %d", i < j && numbers[i] > numbers[j] ? 1 : 0));
                if(i < j && numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    logger.log(Level.INFO, Arrays.toString(numbers));
                }
            }
        }

    }
}
