package HashSets_HashMaps;
import java.util.*;
public class UnionArraysGFG {
    public static ArrayList <Integer> union(int[] a, int[] b){
        ArrayList <Integer> arr = new ArrayList<>();
        HashSet <Integer> set =  new HashSet<>();
        for(int ele : a) set.add(ele);
        for (int ele : b) set.add(ele);

        for(int ele : set) arr.add(ele);
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,1,1};
        int[] b = {2,3,5,6,7,1,2,3,4};
        ArrayList <Integer> ans = union(a, b);
        System.out.println(ans);
    }
}
