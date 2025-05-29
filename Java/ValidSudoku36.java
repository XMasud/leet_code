import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku36 {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean result = isValidSudoku(board);
        System.out.println(result);
    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> maps = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if ((!maps.add(board[i][j] + "row" + i)) || (!maps.add(board[i][j] + "col" + j)) || (!maps.add(board[i][j] + "sub" + i/3 + "-" + j/3))) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
