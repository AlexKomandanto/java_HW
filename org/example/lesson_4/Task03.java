package lesson_4;

import java.util.ArrayDeque;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки в обратном порядке (первая введённая окажется последней выведенной).
Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class Task03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<String>();
        while(true){
            System.out.println("Введите данные в форме text: ");
            String str = sc.nextLine();
            if(str.equals("q"))break;

            else if(str.equals("print")){
                Object[] strings = stack.toArray();
                for(int i = strings.length - 1; i >= 0; i--){
                    System.out.println(strings[i]);
                }
            }
            else if(str.equals("revert")){
                System.out.println(stack.removeLast());
                System.out.println(stack);
            }

            else{
                stack.add(str);
                System.out.println(stack);
            }
        }
        sc.close();


    }
}
