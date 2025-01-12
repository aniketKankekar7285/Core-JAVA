package Multithreading;

public class MyFirstProgram {
    public static void main(String args[]){
        MyfirstThread t=new MyfirstThread();
        t.start();
        int i=1;
        while(i<10){
            System.out.println(i+ " world");
            i++;
        }
    }
}
