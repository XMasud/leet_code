public class TransposeMatrix867 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] result = transpose(matrix);
    }

    private static int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] result = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
