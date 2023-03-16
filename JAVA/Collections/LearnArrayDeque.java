package Collections;
import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args){
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(90);
        adq.offerFirst(33);      //add element at forst
        adq.offerLast(30);       //add element at last
        adq.offer(99);

        System.out.println(adq);
        //peek
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        //poll
        System.out.println(adq.poll());
        System.out.println("poll"+adq);
        System.out.println(adq.pollFirst());
        System.out.println("Poll at first "+adq);
        System.out.println(adq.pollLast());
        System.out.println("Poll at last "+ adq);
        System.out.println(adq);
        System.out.println(adq.offer(30000));
        System.out.println(adq.add(44));
        System.out.println(adq);




    }
    
}
