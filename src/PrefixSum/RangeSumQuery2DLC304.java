package PrefixSum;
class NumMatrix {
    private static int[][] prefix;

    public NumMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        prefix = new int[rows + 1][cols + 1];

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {

                prefix[r][c] = matrix[r - 1][c - 1]
                        + prefix[r - 1][c]
                        + prefix[r][c - 1]
                        - prefix[r - 1][c - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        return prefix[row2 + 1][col2 + 1]
                - prefix[row1][col2 + 1]
                - prefix[row2 + 1][col1]
                + prefix[row1][col1];
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };

        NumMatrix obj = new NumMatrix(matrix);

        System.out.println(obj.sumRegion(2, 1, 4, 3)); // Expected 8
        System.out.println(obj.sumRegion(1, 1, 2, 2)); // Expected 11
        System.out.println(obj.sumRegion(1, 2, 2, 4)); // Expected 12
    }
}