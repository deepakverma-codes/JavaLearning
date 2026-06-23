package com.deepak.aiml;

class Base{
    int x;

    public int getX() {
        System.out.println("Im in Base class and getting X.");
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

}

class Derived extends Base{
    int y;

    public int getY() {
        System.out.println("Im inside Derived class and getting Y.");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{

    static void walk(){
        System.out.println("Animals can walk");
    }

    static void eat(){
        System.out.println("Animals can eat food");
    }
}

class Cat extends Animal{
    static void meow(){
        System.out.println("Cat meows");
    }
}

public class CH10_01_Inheritance {
    public static void main(String[] args) {
//        Base b = new Base();
//        b.setX(5);
//        System.out.println(b.getX());

//        Derived d = new Derived();
//        d.setX(4);
//        System.out.println(d.getX());
          Cat c = new Cat();
          c.meow();
          c.walk();
          c.eat();
    }
}
