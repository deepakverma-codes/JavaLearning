package com.deepak.aiml;

public class CH02_01_Operators {
    public static void main(String[] args) {
       // 01. Arithmetic operator
        int a = 55;
        int b = 7;
        System.out.println(++a);  // Increment operator
        a++;
        System.out.println(a);
        System.out.println(a%b); //  % = modulo operator

        // 02. Assignment opeartor
        int x = 5, y = 4;
        x += 3;
        y -= 1;
        System.out.println("x is = "+ x +" and y is = " + y);

        // 03. Comparison Operator
        System.out.println(5 == 5); // T
        System.out.println(43 >= 222); // F
        System.out.println(1 <= 2);  // T

        // 04. Logical operator
        System.out.println(4 > 1 || 34 < 44); // T
        System.out.println(4 > 1 && 34 < 44); // T

        // 05. Bitwise Operator (&)

        System.out.println(41 & 30);
    }
}
