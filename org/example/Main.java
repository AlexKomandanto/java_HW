public class Main{
    public static void main(String[] args){
        StringBuilder ans = new StringBuilder();
        String text = "abcd fgh";
        ans.append(reverse(text.substring(0, text.length())));
        System.out.println(ans);
    }
//    public static String txt (String text){
//
//    }
    public static String reverse(String text){
        StringBuilder reversed = new StringBuilder();
        for(int i = text.length() - 1; i >= 0;i--){
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }
}
