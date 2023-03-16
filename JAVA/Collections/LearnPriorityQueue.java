package Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
//Comparator reverseOrder---> Used for the increasing order of the elements

public class LearnPriorityQueue {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(22);
        pq.offer(30);
        pq.offer(90);
        System.out.println(pq.add(20));
        System.out.println(pq.offer(900));
        System.out.println(pq.peek());
        System.out.println(pq.element());
        System.out.println(pq.remove());
        System.out.println(pq.poll());
        //It is priority queue so it is giving priority by using small to high number
        System.out.println(pq);
        //Implement MinHEAP by using Priority Queue 
    }
    
}
