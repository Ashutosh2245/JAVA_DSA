/*package Array;
public class sortZeroOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,0,1,1,0,0,0,1};
        int n = arr.length;
        System.out.print("Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int noOfZeroes = 0;
        for(int i=0;i<n;i++){
            if(arr[i] ==0) noOfZeroes++;
        }
        System.out.print("\nSorted array: ");
        for(int i = 0;i<noOfZeroes;i++){
            System.out.print((arr[i] = 0)+" ");
        }
        for(int i = noOfZeroes;i<n;i++){
            System.out.print((arr[i] = 1)+" ");
        }
//        for(int i=0;i<n;i++){
//            if(i<noOfZeroes) System.out.print((arr[i] = 0) + " ");
//            else System.out.print((arr[i] =1) + " ");
//        }
    }
}*/


// METHOD 2 (Two pointers approach)

package Array;
public class sortZeroOnes {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1};
        int n = arr.length;
        System.out.print("Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
       // one pass solution
        int i =0, j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i] == 1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        System.out.print("\nSorted Array: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}

// Use i -> low and j-> high for better understanding.