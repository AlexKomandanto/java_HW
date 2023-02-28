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
        Tom.addAward(new Award("So happy cat", "2st", 2021));
        Tom.addAward(new Award("So best cat", "1st", 2022));

        Cat_Task02 Bars = new Cat_Task02("Bars", "Britain", "Black",
                LocalDate.of(2019, 6, 19), "Harold");
        Bars.addAward(new Award("So sad cat", "1st",2021));

        System.out.println(Tom);
        System.out.println(Bars);

        System.out.println("-------------------------------------------------------" +
                "--------------------------------------------------------");

        KuklachevCat cat1 = new KuklachevCat("Рыжик", "Домашний", "Рыжий",
                LocalDate.of(2017,2,21));
        cat1.addAction(new Action("Гулять", "Alex"));

        KuklachevCat cat2 = new KuklachevCat("Lion", "Русский-голубой", "Белый",
                LocalDate.of(2019,2,21));
        cat2.addAction(new Action("Сидеть", "Alex"));

        KuklachevCat cat3 = new KuklachevCat("Дымок", "Домашний", "Серый",
                LocalDate.of(2017,10,1));
        cat3.addAction(new Action("Голос", "Alex"));
        cat1.addAction(new Action("Дай лапу", "Alex"));

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

    }
}
