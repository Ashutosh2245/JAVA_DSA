package HashSets_HashMaps;
import java.util.*;
public class TreeMap_TreeSet {
    public static void main(String[] args) {
        HashSet <Integer> set1 = new HashSet<>();
        System.out.print("HashSet: ");
        set1.add(100);
        set1.add(-100);
        set1.add(600);
        set1.add(-1100);
        set1.add(0);
        System.out.print(set1);
        System.out.println();

        TreeSet <Integer> set2 = new TreeSet<>();
        System.out.print("TreeSet: ");
        set2.add(100);
        set2.add(-100);
        set2.add(600);
        set2.add(-1100);
        set2.add(0);
        System.out.print(set2);
        System.out.println();
        System.out.println();

        HashMap <String, Integer> map = new HashMap<>();
        System.out.print("HashMap: ");
        map.put("Ashutosh",11);
        map.put("Ashu",11);
        map.put("Raman",22);
        map.put("john",33);
        map.put("rocky",44);
        map.put("Sunny",36);
        System.out.println();
        for (String key : map.keySet()){
            System.out.println(key + " "+map.get(key));
        }
        System.out.println();

        TreeMap <String, Integer> map2 = new TreeMap<>();
        System.out.print("TreeMap: ");
        map2.put("Ashutosh",11);
        map2.put("Ashu",11);
        map2.put("Raman",22);
        map2.put("john",33);
        map2.put("rocky",44);
        map2.put("Sunny",36);
        System.out.println();
        for (String key : map2.keySet()){
            System.out.println(key + " "+map2.get(key));
        }
    }
}
// TreeSet & TreeMap -> Sorted or Ordered
// HashSet or HashMap -> Unsorted or Unordered
