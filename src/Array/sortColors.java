// one pass solution

/*package Array;
public class sortColors {
    public static void main(String[] args) {
        int[] arr = {

        0,2,1,1,1,2,2,2,0,0,1,2,2};
        int n = arr.length;
        System.out.print("Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int noOfZeroes = 0, noOfOnes = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) noOfZeroes++;
            else if (arr[i]==1) noOfOnes++;
        }
        for(int i =0;i<n;i++){
            if(i<noOfZeroes) arr[i]=0;
            else if(i<noOfZeroes + noOfOnes) arr[i] =1;
            else arr[i] = 2;
        }
        System.out.print("\nSorted Array: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
*/

// METHOD 2 (Three Pointers Approach or Dutch Flag Algorithm)

package Array;
public class sortColors {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 1, 1, 2, 2, 2, 0, 0, 1, 2, 2};
        int n = arr.length;
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int mid=0,high=n-1,low=0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++; mid++;
            }
            else if (arr[mid] ==1) {
                mid++;
            }
            else { //means arr[mid] = 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high --;
            }
        }
        System.out.print("\nSorted Array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}