import java.util.HashSet;

public class HashSetPractise {
    public static void main(String args[])
    {
        HashSet<Integer> hs=new HashSet<>(10,0.50f);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(30);
        hs.add(20);

        System.out.println(hs);

    }
}
