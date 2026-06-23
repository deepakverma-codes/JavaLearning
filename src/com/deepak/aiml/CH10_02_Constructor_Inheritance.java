package com.deepak.aiml;

class Base1{
    Base1(){
        System.out.println("I am a constructor of Base1");
    }
    Base1(int x){
        System.out.println("I am constructor of Base1 with value of x: "+ x);
    }
}

class Derived1 extends Base1{

    Derived1(){
        System.out.println("I am a constructor of derived1");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am constructor of Derived1 with value of y: "+ y);
    }
}

class DerivedChild extends Derived1{
    DerivedChild(){
        System.out.println("I am a constructor of DerivedChild ");
    }
    DerivedChild(int x, int y, int z){
        super(x,y);
        System.out.println("I am constructor of DerivedChild with value of z: "+ z);
    }
}

public class CH10_02_Constructor_Inheritance {
    public static void main(String[] args) {
        DerivedChild dc = new DerivedChild(4,9,15);
    }
}
