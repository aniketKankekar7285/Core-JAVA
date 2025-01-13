package Multithreading;
class ATM{
    int balance=1000;
  public int checkBalance(String name){
       return balance;
   }

   public synchronized void withDrawAmount(String name,int amount){
       if(amount<balance){
           balance-=amount;
           System.out.println(balance);
       }
   }
}
class Customer1 extends Thread{
    ATM atm;
    String name;
    int amount;
    Customer1(ATM atm, String name, int amount){
        this.atm=atm;
        this.name=name;
        this.amount=amount;
    }

    void useATM(){
        atm.checkBalance(name);
        atm.withDrawAmount(name,amount);
    }

    @Override
    public void run() {
      useATM();
    }
}

class Customer2 extends Thread{
    ATM atm;
    String name;
    int amount;
    Customer2(ATM atm,String name,int amount){
        this.atm=atm;
        this.name=name;
        this.amount=amount;
    }
    void useATM(){
        atm.checkBalance(name);
        atm.withDrawAmount(name,amount);
    }

    @Override
    public void run() {
        useATM();
    }
}


public class ATMExample {
    public static void main(String args[]){
        ATM atm=new ATM();
        Customer1 customer1=new Customer1(atm,"Sagar",200);
        Customer2 customer2=new Customer2(atm,"Aniket",50);
        customer1.start();
        customer2.start();
    }
}
