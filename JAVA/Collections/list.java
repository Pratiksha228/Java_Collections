package Collections;
import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(20);
        list.add(30);
        list.add(21);
        System.out.println(list);
        list.add(200);
        System.out.println(list);
        list.add(2, 50);
        System.out.println(list);
        //if we want to add newlist to our existing list
        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(200);
        list.addAll(newList);  //use addAll function
        System.out.println(list);
        //get function
        System.out.println(list.get(3));

        list.remove(2);      //O(1)
        System.out.println(list);
        list.remove(Integer.valueOf(30));
        System.out.println(list);

        // list.clear();
        // System.out.println(list);

        //Update the list value
        list.set(2,1000);     //O(1)
        System.out.println(list);
        //Check if the element is present in the list or not
        System.out.println(list.contains(150));   //O(n)
        System.out.println(list.contains(500));

        //list.size() function to know the size of the arraylist
        for(int i = 0; i<list.size(); i++){
            System.out.println("List elements are: "+list.get(i));

        //for-each loop
        for(Integer element: list){
            System.out.println("For-each loop: "+element);
        }
        }
        }
    
}
