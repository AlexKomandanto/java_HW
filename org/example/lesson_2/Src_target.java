package org.example.lesson_2;

public class Src_target {
    public static void main(String[] args){
        dfs(1,7,2,1,"");
    }
    public static void dfs(int src, int target, int mult, int add, String path){
        if(src == target) System.out.println(path);
        if(src > target) return;
        dfs(src * mult, target, mult, add, path + " k1");
        dfs(src + add, target, mult, add, path + " k2");

    }
}
