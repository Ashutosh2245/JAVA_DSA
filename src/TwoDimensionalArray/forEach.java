package TwoDimensionalArray;
public class forEach {
    public static void main(String[] args) {
        //1D Array
        int [] a = {4,7};
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();

        //2D Array
        int[][] b = {{1,2,3},{4,5,6}};
        for(int[] ele: b){
            for(int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}

// 2D Array is known as array of array.
//  int[][] b = {{1,2,3},{4,5,6}};
// 1 2 3
// 4 5 6