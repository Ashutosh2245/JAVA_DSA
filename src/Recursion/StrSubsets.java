package Recursion;
import java.util.ArrayList;
public class StrSubsets {
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args) {
        String s = "Ashu";
        arr = new ArrayList<>();
        printSubsets(0,s,"");
        System.out.println(arr);
    }
    public static void printSubsets(int i, String s, String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        printSubsets(i+1,s,ans); //not take
        ans += s.charAt(i);
        printSubsets(i+1, s, ans); //take
    }
}
