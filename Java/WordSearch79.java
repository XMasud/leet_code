public class WordSearch79 {
    public static void main(String[] args) {
        String[][] board = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
        boolean result = exist(board, "ABCCED");
    }

    private static boolean exist(String[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }

        return false;
    }
}
