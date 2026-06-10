import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes73 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] xPosition = new boolean[row];
        boolean[] yPosition = new boolean[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (matrix[i][j] == 0) {
                    xPosition[i] = true;
                    yPosition[j] = true;
                }
            }
        }


        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {

                if (xPosition[j] || yPosition[k]) {
                    matrix[j][k] = 0;
                }
            }
        }
    }
}
