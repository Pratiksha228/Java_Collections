package Collections;
import java.util.Set;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(40);
        set.add(90);
        set.add(99);
        set.add(20);
        set.add(56);
        set.add(2);
        System.out.println(set);
        set.remove(90);
        System.out.println(set);
        System.out.println(set.contains(100));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        //set.clear()
        System.out.println(set);

    }
    
}
