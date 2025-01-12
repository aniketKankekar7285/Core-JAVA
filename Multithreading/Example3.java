package Multithreading;
class Mythread extends Thread{
    @Override
    public void run() {
       int count=1;
       while(true){
           try {
               System.out.println(count++);
               sleep(1000);
           }catch (InterruptedException e){
               System.out.println(e);
           }
       }
    }
    Mythread(String name){
        super(name);
        setPriority(MAX_PRIORITY);
    }
}
public class Example3 {
    public static void main(String args[]){
        Mythread m1=new Mythread("My first thread");
        System.out.println("ID: "+m1.getId());
        System.out.println("Name: "+m1.getName());
        System.out.println("priority: "+m1.getPriority());
        System.out.println("State: "+m1.getState());
        m1.start();
        m1.interrupt();
    }
}
