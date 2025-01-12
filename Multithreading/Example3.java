package Multithreading;
class Mythread extends Thread{
    @Override
    public void run() {
       int count=1;
       while(count<1000){
           System.out.println(count++);
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
        System.out.println("ID: "+m1.getId());
        System.out.println("Name: "+m1.getName());
        System.out.println("priority: "+m1.getPriority());
        System.out.println("State: "+m1.getState());
        m1.setDaemon(true);
        m1.start();
        Thread mainThread=Thread.currentThread();
        mainThread.join();
    }
}
