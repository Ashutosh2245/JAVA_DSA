package Stack;
import java.util.*;
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Expression: ");
        String s = sc.nextLine();
        System.out.println(isValid(s));
        System.out.println("Min no of removal to make balanced: "+minRemove(s));
    }
    static boolean isValid(String s){
        Stack <Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '('|| ch== '{'|| ch=='['){
                st.push(ch);
            }
            else{
                if (st.isEmpty()) return false;
                char top = st.pop();
                if ((ch==')' && top != '(')||(ch=='}' && top != '{')||(ch==']' && top != '[')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    static int minRemove(String s){
        Stack <Character> st = new Stack<>();
        int removal = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    removal++;
                }else{
                    char top = st.peek();
                    if((ch==')' && top == '(')||(ch=='}' && top == '{')||(ch==']' && top == '[')){
                        st.pop();
                    }else{
                        removal++;
                    }
                }
            }
        }
        removal += st.size();
        return removal;
    }
}
