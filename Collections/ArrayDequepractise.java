import java.util.ArrayDeque;

public class ArrayDequepractise {
    public static void main(String args[]){
        ArrayDeque<Integer> Aq=new ArrayDeque<>();
        Aq.addFirst(10);
        Aq.addLast(30);
        Aq.addFirst(20);
        while(Aq.isEmpty()==false){
            System.out.println(Aq.getFirst());
            Aq.removeFirst();
        }

        System.out.println("*********************");
        Aq.addFirst(10);
        Aq.addLast(30);
        Aq.addFirst(20);

        Aq.addLast(60);
        Aq.addLast(89);

       Aq.forEach(x->System.out.println(x));



    }
}
