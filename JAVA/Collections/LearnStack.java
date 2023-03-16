//Stack- First In Last Out OR Last In First Out(LIFO)
package Collections;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args){
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Giraff");
        animals.push("Pig");
        animals.push("Dog");
        System.out.println("Stack will be look alike: "+animals);
        //If we want to know the peek element of the stack
        System.out.println(animals.peek());
        //Most top element will be pop out from the stack
        animals.pop();
        System.out.println(animals.peek());
        animals.push("Cat");
        System.out.println(animals);

    }
    
}
