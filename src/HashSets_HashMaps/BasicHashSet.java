package HashSets_HashMaps;
import java.util.*;
public class BasicHashSet {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        // Insert : Tc = O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        System.out.println("Size: "+set.size());
        System.out.println(set);
        set.add(-8);
        set.add(200);

        System.out.println(set);
        System.out.println("Size: "+set.size());

        // search - true/false : TC = O(1)
        System.out.println(set.contains(50));
        set.add(50);
        System.out.println(set);
        System.out.println("Size: "+set.size());
        System.out.println(set.contains(50));

        set.remove(50);
        System.out.println(set);
        System.out.println("Size: "+set.size());
        Object[] arr = set.toArray();
        System.out.print("HashSet to array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
