package queue;
import java.util.Queue;
import java.util.LinkedList;

public class Que {
 public static void main(String[] args){
     Queue<Integer> q = new LinkedList<Integer>();

     q.add(10);
     q.add(20);
     q.add(30);
   
    Integer data =  q.poll();
     System.out.println("you polled :" + data);
     q.add(40);
     System.out.println(q);

     while(!q.isEmpty()){
         System.out.println(q.poll());
     }
 }   
}
