package com.deepak.aiml;

class Parent{
    int t;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        t = t;
    }

    Parent(){
        System.out.println("I am Parents's Constructor");
    }
    Parent(int x){
        System.out.println("Parent Int X");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("I am child's constructor");
    }
    Child(int x, int y){
        super(x);
        System.out.println("Child Int Y");
    }
}

public class CH10_03_ThisAndSuper {
    public static void main(String[] args) {
        Child c = new Child(5,10);
    }
}
