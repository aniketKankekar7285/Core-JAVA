package Inheritance;

import java.lang.*;

class Circle{
    private double radius;
    public Circle(){
        radius=8.0;
    }
    public double area(){
       return 3.1428* radius*radius;
    }
    public double perimeter(){
       return 2* 3.1428 * radius;
    }
}


class Cylinder extends Circle{
    private double height=10;
   public double getVolume(){
       return area()*height;
   }
}

class InheritanceExample{
    public static void main(String args[]){
        Cylinder c1=new Cylinder();
        System.out.println(c1.area());
        System.out.println(c1.getVolume());
    }
}