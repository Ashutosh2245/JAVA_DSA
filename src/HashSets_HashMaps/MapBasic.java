package HashSets_HashMaps;
import java.util.*;
public class MapBasic {
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        map.put("Ashutosh",22);
        map.put("Himanshu",11);
        map.put("Rocky",11);
        System.out.println(map);
        System.out.println(map.containsKey("Ashutosh"));
        System.out.println(map.containsValue(11));
        map.put("Ashutosh",44); // It will overwrite
        System.out.println(map);
        map.put("David",55);
        System.out.println(map);
        System.out.println("Size: "+map.size());
        map.remove("Rocky");
        System.out.println(map);
        System.out.println(map.get("Ashutosh"));
    }
}
// Keys must be same but values can be same for two or more keys.
// Map -> Key & Value pair