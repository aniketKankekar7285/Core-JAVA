package Inheritance;

class baseClass{
    public void Display(){
        System.out.println("display method of baseClass");
    }
}
class SubClass extends baseClass{
    public void Display(){
        System.out.println("display method of SubClass");
    }
}
public class MethodOverriding {
    public static void main(String args[]){
        baseClass b=new SubClass();
        b.Display();
    }
}
