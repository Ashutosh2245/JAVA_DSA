package HashSets_HashMaps;
import java.util.*;
public class IterateMap {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        map.put("Ashutosh",22);
        map.put("Himanshu",11);
        map.put("Rocky",11);
        System.out.println(map.get("Ashutosh"));
        for(String key : map.keySet()){
            System.out.print(key + " ");
            System.out.println(map.get(key));
        }
        System.out.println();

        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();
        for(Object pair : map.entrySet()) {
            System.out.println(pair);
        }
    }
}

/*
package HashSets_HashMaps;
import java.util.*;

public class IterateMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ashutosh", 22);
        map.put("Himanshu", 11);
        map.put("Rocky", 11);

        // Get value by key
        System.out.println(map.get("Ashutosh"));
        System.out.println();

        // Iterate using keySet()
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println();

        // Iterate values only
        for (int val : map.values()) {
            System.out.println(val);
        }
        System.out.println();

        //BEST way: Iterate key + value together
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }
}
*/