import java.util.Comparator;
import java.util.PriorityQueue;
class myComparator implements Comparator<Integer>
{
     public int compare(Integer o1,Integer o2){
         if(o1<o2){
             return 1;
         }
         else{
             return -1;
         }
     }
}
public class PriorityQueuePractise {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>(new myComparator());
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(23);
        pq.add(21);
        pq.add(100);
        pq.forEach(x->System.out.println(x));
        System.out.println("******************");
        while(pq.isEmpty()==false){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
