package Array;
public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {20,25,45,67,89};
        System.out.print("First sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int[] brr = {17,34,58,99,105,220};
        System.out.print("\nSecond sorted array: ");
        for(int j=0;j<brr.length;j++){
            System.out.print(brr[j]+" ");
        }

        int[] crr = new int[arr.length+brr.length];
        int i = 0, j = 0, k = 0;

        //Merging
        while (i<arr.length && j<brr.length){
            if(arr[i]<=brr[j]){
                crr[k] = arr[i];
                i++; k++;
            }
            else{ //arr[i]>brr[j]
                crr[k] = brr[j];
                j++; k++;
            }
        }
        if(i==arr.length){//now take elements from brr only
            while(j<brr.length){
                crr[k] = brr[j];
                j++; k++;
            }
        }
        if(j==brr.length){//now take elements from arr only
            while(i<arr.length){
                crr[k] = arr[i];
                i++; k++;
            }
        }
        System.out.print("\nNew array after merging: ");
        for(int ele:crr){
            System.out.print(ele+" ");
        }
    }
}
