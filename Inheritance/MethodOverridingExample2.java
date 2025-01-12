package Inheritance;

class Tv{
    public void switchOn(){
       System.out.println("turning on normal TV");
    }
}

class SmartTv extends Tv {
    @Override
    public void switchOn(){
        System.out.println("Turning on SmartTv");
    }

    public void browse(){
        System.out.println("browsing smart Tv");
    }
}

public class MethodOverridingExample2 {
    public static void main(String args[]){
       Tv tv=new SmartTv();
       tv.switchOn();

    }
}
