package HashSets_HashMaps;
import java.util.*;
public class SetIterator {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(20);
        set.add(20);
        set.add(20);
        set.add(100);
        set.add(10);
        System.out.println("Size: "+set.size());
        System.out.println(set);
        set.add(-8);
        set.add(200);
        System.out.println(set);
        System.out.print("Set to array: ");
        for(int num : set){
            System.out.print(num + " ");
        }
        System.out.println();
        set.clear();
        System.out.print(set);
        System.out.println();
        HashSet <String> set2 = new HashSet<>();
        set2.add("Ashutosh");
        set2.add("John");
        set2.add("Ashutosh"); // Duplicate set elements
        set2.add("John");
        System.out.println(set2);
    }
}
// Occurrence of any element will be exact 1.
// If any element is already present then we cannot add that element again.


