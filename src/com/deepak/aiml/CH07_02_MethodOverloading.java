package com.deepak.aiml;

public class CH07_02_MethodOverloading {
    static void add(int x, int y){
        System.out.println(x+y);
    }
    static void add(int x, int y, int z){
        System.out.println(x+y+z);
    }
    static void add(byte x, int y, int z){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        // Method Overloading. - Two or more method can have same name but different parameter
        add(3,5);
        add(4,6,7);
        add((byte)4,6,7); // 4,6,7 are argument.
        // Arguments are actual.
    }
}
