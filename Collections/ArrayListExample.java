package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<Integer> Al=new ArrayList<>(10);
        Al.add(10);
        ArrayList<Integer> Al2=new ArrayList<>(List.of(10,20,30,40,50));
        Al.addAll(Al2);

        ArrayList<Integer> Al3=new ArrayList<>(List.of(2,3,4,5));
        Al3.addAll(0,Al2);

        System.out.println(Al3.contains(3));

        System.out.println(Al.get(2));

        System.out.println(Al.indexOf(30));

        for(int i=0;i<Al.size();i++)
        {
            System.out.println(Al.get(i));
        }

        for (int i = 0; i < Al.size(); i++) {
            Integer integer = Al.get(i);
            System.out.println(integer);
        }

        Iterator<Integer> it=Al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Al.forEach(n->System.out.println(n));

        Al.forEach(System.out::println);

        System.out.println("************************");

        Al.forEach(n->show(n));

    }
    static void show (int k)
    {
        if(k>10){
            System.out.println(k);
        }
    }
}
