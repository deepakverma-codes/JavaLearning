package com.deepak.aiml;

public class CH07_05_PracticeSet {
     static void table (int x ){
        for (int i = 1; i < 11; i++){
            System.out.printf("%d X %d = %d", x, i, x*i);
            System.out.print("\n");
        }
    }
    static void pattern1(int n){
         for (int i = 1; i<=n; i++){
             for (int j = 1; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
    public static void main() {
        // Ques 1 Table by method
        table(5);
        // CH07_05_PracticeSet obj = new CH07_05_PracticeSet();
        // obj.table(5);
        pattern1(4);
    }
}
