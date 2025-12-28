package Stack;
import java.util.*;
public class RemoveConsecutiveSubsequences {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int [] res = remove(arr);
        System.out.print("Resultant: ");
        for (int num : res) {
            System.out.print(num+" ");
        }
    }
    public static int[] remove(int[] arr){
        Stack <Integer> st = new Stack<>();
        int n = arr.length;
        for (int i=0;i<n;i++){
            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if (st.peek() == arr[i]){
                if(arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }
        int[] res = new int[st.size()];
        int m = res.length;
        for (int i = m-1; i >= 0 ; i--) {  //For bottom to top
            res[i] = st.pop();
        }
        return res;
    }
}




//package Stack;
//import java.util.*;
//public class RemoveConsecutiveSubsequences {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        List <Integer> result = removeAllConsecutiveSubsequences(arr);
//        System.out.print("After removing consecutive subsequences: ");
//        for (int x : result) {
//            System.out.print(x + " ");
//        }
//    }
//    static List<Integer> removeAllConsecutiveSubsequences(int[] arr) {
//        Stack<int[]> stack = new Stack<>(); // {value, count}
//        for (int num : arr) {
//            if (!stack.isEmpty() && stack.peek()[0] == num) {
//                stack.peek()[1]++;
//            } else {
//                stack.push(new int[]{num, 1});
//            }
//            if (stack.peek()[1] > 1) {
//                stack.pop();
//            }
//        }
//        List<Integer> result = new ArrayList<>();
//        for (int[] pair : stack) {
//            result.add(pair[0]);
//        }
//        return result;
//    }
//}
