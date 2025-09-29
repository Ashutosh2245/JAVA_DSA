package Array;
public class DeletionOfElement {
    public static void main(String[] args) {
        int key = 30;
        int [] arr = {10,20,30,40,50};
        int pos = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==key) {
                pos = i;
                break;
            }
        }
        if (pos==-1) System.out.println("Element not found");
        else {
            for (int i = pos; i < n-1; i++) {
                arr[i]=arr[i+1];
            }
            n--;
            for(int i=0;i<n;i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
