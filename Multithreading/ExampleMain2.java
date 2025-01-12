package Multithreading;

public class ExampleMain2 {
    public static void main(String args[]){
        Example2 ex2=new Example2();
        Thread t=new Thread(ex2);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}
