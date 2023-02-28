package lesson_6;

import java.time.LocalDate;

/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.

 */
public class Task02 {
    public static void main(String[] args) {
//        Cat_Test cat = new Cat_Test("Барсик", "Иван Иванович", "Ориетал", 5.410f);
//        System.out.println(cat.getName());
//        cat.setName("Мурзик");
        Cat_Task02 Tom = new Cat_Task02("Tom", "Oriental", "Red",
                LocalDate.of(2020, 3, 22), "Arnold");
        Cat_Task02 Bars = new Cat_Task02("Bars", "Britain", "Black",
                LocalDate.of(2019, 6, 19), "Harold");
        Tom.addAward(new Award("So happy cat", "2st", 2021));
        Tom.addAward(new Award("So best cat", "1st", 2022));
        Bars.addAward(new Award("So sad cat", "1st",2021));
        System.out.println(Tom);
        System.out.println(Bars);



    }

}
