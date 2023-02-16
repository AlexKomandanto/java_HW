package lesson_2.sem2;

public class Task03_palindrom {
    public static void main(String[] args) {
        String str = "12321";
        System.out.println(isPalindrome(str));
    }

    private static Boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
