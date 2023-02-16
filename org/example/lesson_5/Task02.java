package lesson_5;

import java.util.HashMap;

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
(Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true

 */
public class Task02 {
    public static void main(String[] args) {
        String a = "paper";
        String t = "title";

    }
    public static boolean isIsomorph (String a, String b){
        HashMap<Character, Character> isomorph = new HashMap<Character, Character>();

        if(a.length() != b.length())return false;

        for(int i = 0; i < a.length(); i++){
            isomorph.put(a.charAt(i), b.charAt(i));
            if(isomorph.containsKey(a.charAt(i))){
                isomorph.get(a.charAt(i)).equals(b.charAt(i));
            }
        }
    }
}
