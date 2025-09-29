//package Recursion;
//import java.util.Scanner;
//public class GenerateParenthesesLC22 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter No. ");
//        int n = sc.nextInt();
//        print(0,0,n,"");
//    }
//    public static void print(int open , int close, int n, String s){
//        if(s.length()==2*n){
//            System.out.println(s);
//            return;
//        }
//        if(open<n) print(open+1,close,n,s+"(");
//        if(close<open) print(open,close+1,n,s+")");
//    }
//}


// Method 2
package Recursion;
import java.util.*;
public class GenerateParenthesesLC22 {
    static List<String> ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. ");
        int n = sc.nextInt();
        GenerateParenthesesLC22 obj = new GenerateParenthesesLC22();
        List<String> result = obj.generateParentheses(n);
        System.out.println(result);
    }
    public List<String> generateParentheses(int n){
        ans = new ArrayList<>();
        print(0,0,n,"");
        return ans;
    }
    public static void print(int open , int close, int n, String s){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n) print(open+1,close,n,s+"(");
        if(close<open) print(open,close+1,n,s+")");
    }
}

