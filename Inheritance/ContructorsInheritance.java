package Inheritance;

class Parent{
    public Parent(){
        System.out.println("Constructor of parent class");
    }
}

class Child extends Parent {
    public Child(){
        System.out.println("Constructor of Child class");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("Constructor of Grand Child");
    }
}
public class ContructorsInheritance {
    public static void main(String args[]){
        GrandChild gc=new GrandChild();
    }
}
