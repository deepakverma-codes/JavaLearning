package com.deepak.aiml;

class MyNewEmployee{
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public MyNewEmployee(String myName){
         id = 0;
         name = myName;
    }
    public MyNewEmployee(){
            this.id = 22;
            this.name = "Enter-Your-Name";
    }

}


public class CH09_03_Constructor {
    public static void main(String[] args) {
        MyNewEmployee deepak = new MyNewEmployee();
//        MyNewEmployee deepak = new MyNewEmployee("Default Name");
        System.out.println(deepak.getId());
        System.out.println(deepak.getName());
    }
}
