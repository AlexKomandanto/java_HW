package org.example.lesson_3.HW3.WH3_04json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task04 {
    public static void main(String[] args) throws Exception {


        // создание списка словарей
        ArrayList<Map<String, String>> list = new ArrayList<>();

        // создание самого словаря
        Map<String, String> map = new HashMap<>();

        // парсим стороку, убираем лишние символы и записываем данные в словарь
//        String[] keys = sb.toString().replace("{", "").
//                replace("[", "").
//                replace("]", "").
//                replace("\"", "").
//                replaceAll("\\s", "").
//                split("},");
//
//        for(String data : keys){
//            String[] person = data.split(",");
//            for(String keyValues: person){
//                String[] keyValue = keyValues.replace("}", "").split(":");
//                String key = keyValue[0];
//                String value = keyValue[1];
//                map.put(key, value);
//            }
//            System.out.printf("студент %s получил %s по предмету %s \n", map.get("фамилия"),
//                    map.get("оценка"), map.get("предмет"));
//        }

    }

}
