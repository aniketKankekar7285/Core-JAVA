package ExceptionHandling;

public class Example1 {
    static int calculateArea(int length,int breadth) throws Exception{
        if( length<0 || breadth<0){
            throw new Exception("negative Dimensions");
        }
        else{
            return length*breadth;
        }
    }
   static void areaCalculator(){
        try {
           System.out.println(calculateArea(-20, 10));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        areaCalculator();
    }
}
