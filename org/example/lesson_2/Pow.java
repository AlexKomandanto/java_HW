package org.example.lesson_2;

public class Pow {
    public static void main(String[] args){
        System.out.println(pow(3,3));
        System.out.println(pow(2,-3));
    }
    private static double pow(double base, int pow){
        if(pow == 1) return base;
        if(pow == 0) return 1;
        if(pow < 0) return pow(1 / base, -pow);
        double sqrt = pow(base, pow / 2);
        double result = sqrt * sqrt;
        if(pow % 2 == 1) result *= base;
        return result;

    }
}
