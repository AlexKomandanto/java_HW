package MethodsAll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LibraryMetods {


    // получение рандомного инт от мин до макс
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;

    }

    public static int addAndCreate(int n) {
        int repeatCount = 1_000_000;

        long begin = System.nanoTime(); // текущее время в наносекундах 0.000 000 001 с

        ArrayList<Integer> arrayList = new ArrayList<>();  //создание и добавление элем в ArrayList
        for (int i = 0; i < repeatCount; i++)
            arrayList.add(i);

        long mid = System.nanoTime();

        LinkedList<Integer> linkedList = new LinkedList<>();    //создание и добавление элем в linkedList
        for (int i = 0; i < repeatCount; i++)
            linkedList.add(i);


        return repeatCount;
    }

    //считывание текста из консоли и его ретерн
    public static Integer scannerText() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите данные: ");
//        String text = sc.nextLine();
//        sc.close(); // обязательно закрыть сканер
//        System.out.println(text);
//
//        return text;

        Scanner iScanner = new Scanner(System.in);  //   Виды спецификаторов для вывода
        System.out.printf("int a: ");               //   %d: целочисленных значений
        int x = iScanner.nextInt();                 //  %x: для вывода шестнадцатеричных чисел
        System.out.printf("double a: ");            //  %x: для вывода шестнадцатеричных чисел
        double y = iScanner.nextDouble();           //   %f: для вывода чисел с плавающей точкой
        System.out.printf("%d + %f = %f",x,y,x +y);  //   %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
        iScanner.close();                           //   %c: для вывода одиночного символа
        return x;                                   //   %s: для вывода строковых значений

    }


    // функция StringBuilder
    private static String buildTask(String  str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100; i++) {
            sb.append(str);
        }
        return sb.toString();
    }


    // чтение файла с выводом ошибки(при неправильном чтении)
    private static void writeFile(String str){
        try(FileWriter writer = new FileWriter("TEST_1.txt", false))
        {
        // запись всей строки
            writer.write(str);
        // запись по символам
        //      writer.append('\n');
        //      writer.append('E');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


    // Работа с файлами
    //Чтение, Вариант посимвольно
    private static String FileReade(String[] args) throws IOException {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
        return null;
    }

    //Работа с файлами
    //Вариант построчно
    private static String BufferedReader(String[] args) throws IOException{

          BufferedReader br = new BufferedReader(new FileReader("file.txt"));
          String str;
          while ((str = br.readLine()) != null) {
              System.out.printf("== %s ==\n", str);
          }
          br.close();
        return null;
    }


    // ыввод массива в консоль в одну строку
    public static void arrayPrintLine(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + ' ');
        }
    }

}
