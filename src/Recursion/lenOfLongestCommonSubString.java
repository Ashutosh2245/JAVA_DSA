package Recursion;
import java.util.Scanner;
public class lenOfLongestCommonSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("Length of longest common SubString: "+longestSubStr(s1,s2));
    }
    public static int SubStr(String s1, String s2, int i, int j, int count){
        if(i==s1.length() || j==s2.length()) return count;

        int count1 = count;
        if(s1.charAt(i)==s2.charAt(j)){
            count1 = SubStr(s1,s2,i+1,j+1,count+1);
        }
        int count2 = SubStr(s1,s2,i+1,j,0);
        int count3 = SubStr(s1,s2,i,j+1,0);
        return Math.max(count1,Math.max(count2,count3));
    }
    public static int longestSubStr(String s1, String s2){
        return SubStr(s1,s2,0,0,0);
    }
}
