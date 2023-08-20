import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


class Point implements Comparable {
    int x;
    int y;

    Point(int a,int b){
        x=a;
        x=b;
    }

    @Override
    public int compareTo(Object o) {
        Point p=(Point)o;
        if(this.x<p.x){
            return 1;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "x: "+x+" y: "+y;
    }
}


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

        TreeSet<Point> ts2=new TreeSet<>();
        ts2.add(new Point(10,20));
        ts2.add(new Point(100,20));
        ts2.add(new Point(11,20));
        ts2.add(new Point(10,223));
        ts2.add(new Point(9,2));

        System.out.println(ts2);

    }
}
