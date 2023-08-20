import java.util.LinkedList;
import java.util.List;

public class LinkedListPractise {
    public static void main(String args[]){
        LinkedList<Integer> l=new LinkedList<>();
        l.add(10);
        l.addAll(List.of(20,30,204));

        for(var x:l){
            System.out.println(x);
        }

        System.out.println("********");

        System.out.println(l.peek());

        LinkedList<Integer> l2=new LinkedList<>();
        l.addAll(l2);



    }
}
