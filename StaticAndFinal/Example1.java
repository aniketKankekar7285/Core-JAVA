package StaticAndFinal;
class Hondacity{
    static long price=10L;
    int a,b;
    static double OnroadPrice(String city){
        switch (city) {
            case "Delhi":
                return price+price*0.8;
            case "Mumbai":
                return price+price*0.9;
            default:
                return price;
        }
    }
}
public class Example1 {
    public static void main(String args[]){
        Hondacity h1=new Hondacity();
        System.out.println(Hondacity.OnroadPrice("Mumbai"));
    }
}
