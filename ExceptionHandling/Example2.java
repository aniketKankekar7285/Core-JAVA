package ExceptionHandling;

public class Example2 {
   static void calculateArea(int length,int breadth){
        try{
            System.out.println(length/breadth);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("final message");
        }
    }
    public static void main(String args[]){
        calculateArea(10,0);
    }
}
