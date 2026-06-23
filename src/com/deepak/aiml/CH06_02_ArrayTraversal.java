package com.deepak.aiml;

public class CH06_02_ArrayTraversal {
    public static void main(String[] args) {
        int [] marks = {34, 45, 99, 87, 66};
       // System.out.println(marks.length);

        // Array traversal (for loop)
        System.out.println("Array Traversal : -");
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        // Print array in reverse order
        System.out.println("Array Traversal in reverse order");
        for (int i = marks.length - 1; i>=0; i--){
            System.out.println(marks[i]);
        }

        // Print Array list by for each loop
        for (int element : marks){
            System.out.println(element);
        }
    }
}
