package Inheritance;

class Parent2 {
    Parent2(){
        System.out.println("non-param constructor of PArent Class");
    }
    Parent2(int x){
        System.out.println("parameterised constructor of Parent Class");
        System.out.println("x:..."+x);
    }
}

class Child2 extends Parent2 {
    public Child2(){
        System.out.println("non-parameterised constructor of Child2");
    }
    public Child2(int x){
        System.out.println("Parametrised constructor of Child2");
        System.out.println("value of x: "+x);
    }

    public Child2(int x,int y){
        super(y);
        System.out.println("This is paramereised constructor of child");
    }
}

public class ConstructorInheritance2 {
    public static void main(String args[]){
        Child2 ch2=new Child2(10,20);
    }
}
