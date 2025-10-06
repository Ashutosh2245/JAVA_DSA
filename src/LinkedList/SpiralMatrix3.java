package LinkedList;
class SpiralMatrix3 {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int total = rows * cols;
        int[][] ans = new int[total][2];
        int r = rStart, c = cStart;
        int i = 0;
        ans[i][0] = r;
        ans[i][1] = c;
        i++;
        int step = 1;
        while (i < total) {
            for (int j = 0; j < step; j++) {
                c++;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[i][0] = r;
                    ans[i][1] = c;
                    i++;
                }
            }
            for (int j = 0; j < step; j++) {
                r++;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[i][0] = r;
                    ans[i][1] = c;
                    i++;
                }
            }
            step++;
            for (int j = 0; j < step; j++) {
                c--;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[i][0] = r;
                    ans[i][1] = c;
                    i++;
                }
            }
            for (int j = 0; j < step; j++) {
                r--;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[i][0] = r;
                    ans[i][1] = c;
                    i++;
                }
            }
            step++;
        }
        return ans;
    }
    public static void main(String[] args) {
        SpiralMatrix3 obj = new SpiralMatrix3();
        int[][] result = obj.spiralMatrixIII(3, 3, 1, 1);
        for (int[] coord : result)
            System.out.println(coord[0] + " " + coord[1]);
    }
}
