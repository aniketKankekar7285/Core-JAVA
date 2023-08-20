import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.TreeMap;

public class MapPractise {

    public static void  main(String args[])
    {
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",3,"C"));
        System.out.println(tm);
        tm.put(4,"Aniket");
        tm.put(5,"kjasbfsf");

        System.out.println(tm.get(4));
        System.out.println(tm.ceilingEntry(2).getValue());

        Entry<Integer,String> e=tm.firstEntry() ;
        System.out.println(e.getKey()+" "+e.getValue());

        Map<Integer,String> mp=new HashMap<>(Map.of(1,"Aniket",2,"Kankekar"));
        System.out.println(mp);
        mp.put(4,"jssfklj");
        System.out.println(mp);

    }
}
