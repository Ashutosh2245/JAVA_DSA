package HashSets_HashMaps;
import java.util.*;
public class ValidAnagrams242 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = sc.nextLine();
        System.out.print("Enter the second string: ");
        String t = sc.nextLine();
        System.out.print("Valid anagrams: ");
        boolean ans = anagram(s,t);
        System.out.print(ans);

    }
    public static  boolean anagram(String s , String t){
        if(s.length() != t.length()) return false;

        HashMap <Character,Integer> map1 = new HashMap<>();
        HashMap <Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            if(map1.containsKey(key)){ // If key is already present
                int freq = map1.get(key); // Find the current frequency
                map1.put(key, freq+1); // Increase frequency
            }
            else{
                map1.put(key, 1);
            }
        }

        for(int i=0;i<t.length();i++){
            char key = t.charAt(i);
            if(map2.containsKey(key)){
                int freq = map2.get(key);
                map2.put(key, freq+1);
            }
            else{
                map2.put(key, 1);
            }
        }
        for(char key : map1.keySet()){
            if(!map2.containsKey(key)) return false;
            if(!map2.get(key).equals(map1.get(key))) return false;
        }
        return true;
    }
}