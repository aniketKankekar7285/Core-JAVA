import java.util.LinkedHashMap;

public class LinkedHashMapdemo {
    public static void main(String args[]){
        LinkedHashMap<Integer,String> Lhmp=new LinkedHashMap<>(6);
        Lhmp.put(1,"a");
        Lhmp.put(2,"jsb");
        Lhmp.put(3,"sdblsafkj");
        Lhmp.put(4,"sdubsdeu");
        Lhmp.put(5,"wuewehqlwieuewbf");
        Lhmp.put(6,"duwqdwudbwfuewbf");

        System.out.println(Lhmp);

        System.out.println(Lhmp.get(2));
        System.out.println(Lhmp.get(4));

    }
}
