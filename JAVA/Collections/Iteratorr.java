package Collections;
// import java.util.ArrayList;
// import java.util.Iterator;

// public class Iterator {
//     public static void main(String[] args){
//     ArrayList<String> flowers = new ArrayList<String>();
//     flowers.add("Rose");
//     flowers.add("Mogra");
//     flowers.add("chameli");
//     System.out.println(flowers);

//     //using iterator
//     Iterator<String> it = flowers.iterator();

//     while(it.hasNext()){
//         System.out.println("Iterator: "+it.next());
//     }
//     }

// }

// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorr {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
  }
}