package Multithreading;
class Mythread extends Thread{
    @Override
    public void run() {
       int count=1;
       while(count<1000){
           System.out.println("Hello Mythread"+count++);
       }
    }
    Mythread(String name){
        super(name);
        setPriority(MAX_PRIORITY);
    }
}
public class Example3 {
    public static void main(String args[]) throws Exception{
        Mythread m1=new Mythread("My first thread");
        int count=1;
        m1.start();
        while(count<1000){
            System.out.println("Hello main: "+ count++);
            Thread.yield();
        }

    }
}
