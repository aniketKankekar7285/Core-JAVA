package Multithreading;

public class MyfirstThread extends Thread{
    public void run(){
        int i=1;
        while(i<10){
            System.out.println(i+ "  Hello");
            i++;
        }
    }
}


