import java.util.List;
import java.util.TreeSet;

public class TreeSetPractise
{
    public static void main(String args[]){
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,20,30,40,50,10,20,30,40));
        ts.add(100);
        ts.add(20);
        ts.add(23);
        System.out.println(ts);
        ts.remove(10);
        System.out.println(ts);
        System.out.println(ts.ceiling(20));
    }
}
