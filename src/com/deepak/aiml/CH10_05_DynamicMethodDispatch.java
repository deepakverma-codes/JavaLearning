package com.deepak.aiml;

class Admin{
    public void printName1(){
        System.out.println("ADMIN ----- Deepak");
    }
    public void showMessage(){
        System.out.println("Hello !, You are in admin dashboard");
    }
}

class User extends Admin{
    public void printName2(){
        System.out.println("USER -------- Tanu");
    }
    public void showMessage(){
        System.out.println("Hello !, You are in user dashboard");
    }
}

public class CH10_05_DynamicMethodDispatch {
    public static void main(String[] args) {
        Admin ad = new User(); // Allowed
       //  User u = new Admin();  Not Allowed
        ad.printName1();
        ad.showMessage();
        // ad.printName2(); ( NOT ALLOWED)
    }
}
