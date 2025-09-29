package Recursion;
public class ArrayTraverse {
    public static void main(String[] args) {
        int[] arr = {9,1,2,3,5};
        print(0,arr);
    }
    public static void print(int i,int[]arr){
        if(i == arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
}
