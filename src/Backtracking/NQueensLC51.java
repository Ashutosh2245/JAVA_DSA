package Backtracking;
import java.util.*;
public class NQueensLC51 {
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(board, 0, ans);
        return ans;
    }
    public static List<String> makeString(char[][] board){
        List<String> L = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String row = new String(board[i]);
            L.add(row);
        }
        return L;
    }
    public static boolean isSafe(char[][] board, int row, int col){
        for(int i = 0; i < row; i++){ // Vertical check
            if(board[i][col] == 'Q') return false;
        }
        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++){ // left diagonal check
            if(board[row - i][col - i] == 'Q') return false;
        }
        int maxRight = Math.min(row, board.length - 1 - col);
        for(int i = 1; i <= maxRight; i++){ //right diagonal check
            if(board[row-i][col+i] == 'Q') return false;
        }
        return true;
    }
    public static void queen(char[][] board, int row, List<List<String>> ans){
        if(row == board.length){
            ans.add(makeString(board));
            return;
        }
        for(int col = 0; col < board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                queen(board, row+1, ans);
                board[row][col] = '.';

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        List<List<String>> ans = solveNQueens(n);

        for(List<String> solution : ans){
            for(String row : solution){
                System.out.println(row);
            }
            System.out.println(); // blank line after each arrangement
        }

        //System.out.println(ans);
    }
}