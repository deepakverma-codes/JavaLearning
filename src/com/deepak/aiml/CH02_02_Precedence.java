package com.deepak.aiml;

public class CH02_02_Precedence {
    public static void main(String[] args) {
        int a = 55;
        int b = 12;
        int c = 3;
        int k = ((b*b) - (4*a*c)) / (2*a);
        System.out.println(k);
    }
}
