package Multithreading;

class MyData{
    public synchronized void display (String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }

}
class Mythread1 extends Thread{
   MyData d;
    Mythread1(MyData d){
        this.d=d;
    }
    public void run(){
        d.display("Hello world");
    }
}

class Mythread2 extends Thread{
    MyData d;
    Mythread2(MyData d){
        this.d=d;
    }
    public void run(){
        d.display("Welcome to new year");
    }

}

public class Synchronization {
    public static void main(String args[]){
        MyData d=new MyData();
        Mythread1 thread1=new Mythread1(d);
        Mythread2 thread2=new Mythread2(d);
        thread1.start();
        thread2.start();
    }
}
