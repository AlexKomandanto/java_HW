package org.example.lesson_3;

import java.util.ArrayList;
import java.util.List;

public class ConstructEquals {
    static List<List<Integer>> ans ; //переменная класса, которую видят все функции

    private static void helper(List<Integer> comb, int k){
        if(comb.size() == k){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for(int i = 0; i <= 9; i ++){
            comb.add(i);
            helper(comb, k);
            comb.remove(comb.size() - 1);
        }
    }
    public static void main(String[] args){
        ans = new ArrayList<>();

        helper(new ArrayList<>(), 2);
        System.out.println(ans);
    }
}
