package Array;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr= {1,1,1,1,0,0,3,3,4,5,1,1,1};

        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        System.out.print("Max no. of consecutive ones is: "+obj.countOne(arr));
    }
    public int countOne(int [] arr){
        int count = 0, maxCount = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==1) {
                count++;
                maxCount = Math.max(count,maxCount);
            }

            else count=0;
        }
        return maxCount;
    }
}
