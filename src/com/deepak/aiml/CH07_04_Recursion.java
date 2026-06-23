package com.deepak.aiml;

public class CH07_04_Recursion {
    static int factorial(int n){
        if (n == 1 || n == 0) return 1;
        else {
            return n * factorial(n-1);
        }
    }
    static int fibonacci(int x){
        if(x<=1){
            return x;
        }
        else {
            return fibonacci(x-1) + fibonacci(x-2);
        }
    }
    static void main(String[] args) {
        System.out.println(factorial(4));
        int x = 10;
        for (int i = 0; i < x; i++){
            System.out.println(fibonacci(i));
        }
    }
}
