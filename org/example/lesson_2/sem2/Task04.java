package org.example.lesson_2.sem2;

import java.io.FileWriter;
import java.io.IOException;

/*Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
 который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
public class Task04 {
    public static void main(String[] args) throws Exception {
        String str = "TEST ";
        System.out.println(buildTask(str));
        writeFile(buildTask(str));

    }
    private static String buildTask(String  str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    private static void writeFile(String str){
        try(FileWriter writer = new FileWriter("TEST_1.txt", false))
        {
// запись всей строки
            writer.write(str);
// запись по символам
//            writer.append('\n');
//            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}

