package com.deepak.aiml;
 class Cylinder{
    private double height;
    private double radius;

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    double curvedSurfaceArea(){
        return 2*3.14*radius*height;
    }

    double volumeOfCylinder(){
        return Math.PI*(radius)*(radius)*(height);
    }

    // Constructor
     public Cylinder(){
        this.radius = 1;
        this.height = 4;
     }

     // Constructor Overload
     public Cylinder(double myRadius, double myHeight){
         this.radius = myRadius;
         this.height = myHeight;
     }
}
public class CH09_04_Excercise {
   public static void main(String[] args) {
       Cylinder cylinder = new Cylinder();
       // Cylinder cylinder = new Cylinder(4,8); // For Constructor Overload
       cylinder.setRadius(1.2);
       cylinder.setHeight(5.8);
       System.out.println(STR."Radius is \{cylinder.getRadius()} and height is \{cylinder.getHeight()}");
       System.out.println(STR."Surface Area = \{cylinder.curvedSurfaceArea()}");
       System.out.println(STR."Volume = \{cylinder.volumeOfCylinder()}");
    }
}
