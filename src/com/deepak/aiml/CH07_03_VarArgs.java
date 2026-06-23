package com.deepak.aiml;
// VarArgs always come in last.
public class CH07_03_VarArgs {
    static int sum(int... array){
        int result = 0;
        for(int a : array){
            result += a;
        }
        return result;
    }
    static void printName(String compulsoryName,  String... nameArray){
        // String compulsoryName is a fixed parameter.
        System.out.println(compulsoryName);
        for (String element : nameArray){
            System.out.println(element);
        }
    }
    static void main(String[] args) {
        printName("Deepak", "Tanu", "Gaurav");
        // printName(); We have to pass atleast one string to avoid error.
        printName("I'm Compulsory");
        System.out.println(sum(4,6,7,8,8,1));
    }
}
