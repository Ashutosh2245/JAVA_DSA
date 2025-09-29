package Array;
public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,3,0,8,9,7,6,3,3,3,3};

        MajorityElement obj = new MajorityElement();
        System.out.print(obj.countMajority(arr));

    }
    public int countMajority(int[] arr){
        int count = 0, major = 0;
        for(int num : arr){
            if(count == 0){
                major = num;
            }
            if(num == major){
                count++;
            }
            else count--;
        }
        return major;
    }
}
