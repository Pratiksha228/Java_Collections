//Queue - First In First Out(FIFO)

package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args){
        Queue<Integer> Line = new LinkedList<>();
        //offer for appending the elements in the queue
        Line.offer(22);
        Line.offer(30);
        Line.offer(40);
        Line.offer(90);
        System.out.println("Queue will be:" +Line);
        //add function
        Line.add(44);
        System.out.println(Line);
        //element function
        Line.element();
        System.out.println("Peek element of the queue: "+Line.element());
        //peek function
        Line.peek();
        System.out.println("Peek element will be: "+Line.peek());
        //remove function
        System.out.println("Remove the first element which is the line at front end at the queue: "+Line.remove());
        //poll function
        System.out.println("Poll element will be: "+Line.poll());

        //Final Output
        System.out.println(Line);




    }
    
}


//add() --> INsert the specified elemets into the queue. If the task is successful, add() returns true otherwise, if not it throws an exception

//offer() --> Inserts the specified elemets into the queue. If the task is successful, offer() returns true otherwise, it returns false

//element() --> Returns the head of the queue. Throws an exception if the queue is empty

//peek() --> Returns the head of the queue. Returns NULL if the queue if empty

//remove() --> Returns and remove the head of the queue. Throws an exception if the queue is empty.

//poll() --> Returns and remove the head of the queue. Returns the NULL if the queue is empty.