package Stack;
import java.util.Scanner;
import java.util.Stack;
public class PreviousGreaterElement {
    static int[] prevGreater(int[] arr){
        int n = arr.length;
        int[] pge = new int[n];
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pge[i] = -1;
            }
            else{
                pge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return pge;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = prevGreater(arr);
        System.out.print("Previous Greater Elements: ");
        for (int num: result){
            System.out.print(num+" ");
        }
    }
}
