package AdvancedSorting.MergeSort;
import java.util.Arrays;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {12,4,6,8,10};
        int[] brr = {1,3,5,7,9};
        Arrays.sort(arr);
        Arrays.sort(brr);
        int n = arr.length;
        int m = brr.length;
        int[] ans = new int[m+n];
        merge(arr,brr,ans);
        print(arr);
        print(brr);
        print(ans);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i =0, j=0, k=0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            }
            else {
                c[k]=b[j];
                j++;
            }k++;
        }
        while (j<b.length) c[k++] = b[j++];
        while (i<a.length) c[k++] = a[i++];
    }
    public static void print(int[] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
