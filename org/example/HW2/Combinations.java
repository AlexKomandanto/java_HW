package org.example.HW2;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    static List<List<Integer>> ans = new ArrayList<>(); //переменная класса, которую видят все функции

    public static List<List<Integer>> combine(int n, int k){
        helper(0, new ArrayList<>(), n, k);
        return ans;
    }
    private static void helper(int prev, List<Integer> comb, int n, int k){
        if(comb.size() == k){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for(int i = prev + 1; i <= n; i ++){
            comb.add(i);
            helper(i, comb, n, k);
            comb.remove(comb.size() - 1);
        }
    }
}
