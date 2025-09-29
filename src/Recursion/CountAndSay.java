package Recursion;
import java.util.*;
class Solution {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Solution obj = new Solution();
        System.out.print(obj.countAndSay(n));
    }
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1) +"&";
        String ans ="";
        int i =0, j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len = j-i;
                ans += len;
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;
    }
}
