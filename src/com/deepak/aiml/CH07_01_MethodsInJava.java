package com.deepak.aiml;

public class CH07_01_MethodsInJava {
            static int sum(int x, int y){
            int z = x + y;
            x = 50;
            return z;
        }
            static void arrayAccess (int [] arr){
                arr[0] = 444;
        }
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        System.out.println(sum(a,b));
        System.out.println(a); // original a will not be changed.

        // Method invocation by obj creation.
        //CH07_01_MethodsInJava obj = new CH07_01_MethodsInJava();
        //System.out.println(obj.sum(a,b));


        // Reference passing
        int [] marks = {45,67,78,23,65};
        arrayAccess(marks);
        System.out.println(marks[0]); // Value will be changed.
    }
}
