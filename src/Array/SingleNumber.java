package Array;
public class SingleNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,2,3,4};
        SingleNumber obj = new SingleNumber();
        System.out.print(obj.displaySingle(arr));
    }
    public int displaySingle(int[] arr){
        int xor = 0;
        for(int num : arr){
            xor ^= num;
        }
        return xor;
    }
}
