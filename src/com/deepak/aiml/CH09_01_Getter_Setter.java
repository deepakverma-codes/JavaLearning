package com.deepak.aiml;

class Student {
    private String name;
    private int rollNumber;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setrollNumber(int rollNumber) {
        if (rollNumber > 0) {
            this.rollNumber = rollNumber;
        } else {
            System.out.println("WRONG Roll Number");
        }

    }

    public int getrollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

public class CH09_01_Getter_Setter {
    public static void main(String[] args) {

        Student deepak = new Student();
        deepak.setName("Deepak");
        deepak.setrollNumber(21);

//        System.out.println(deepak.getrollNumber());
//        System.out.println(deepak.getName());
        System.out.println(deepak);
    }
}
