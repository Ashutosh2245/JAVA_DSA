package Array;
public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,5,6,7};
        MissingNumber obj = new MissingNumber();
        System.out.print("Missing number: "+obj.missingNumber(arr));
    }
    public int missingNumber(int[] arr){
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= i^arr[i];
        }
        return xor^arr.length;
    }
}
