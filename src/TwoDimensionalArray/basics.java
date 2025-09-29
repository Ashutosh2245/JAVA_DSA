package TwoDimensionalArray;
public class basics {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[1][0] = 4;
        grid[1][1] = 5;
        grid[1][2] = 6;
        grid[2][0] = 7;
        grid[2][1] = 8;
        grid[2][2] = 9;

        System.out.println("Matrix: ");
        for(int i=0;i<=2;i++){
            for(int j = 0;j<=2;j++){
                System.out.print(grid[i][j] +" ");
            }
            System.out.println();
        }

    }
}
