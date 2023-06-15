import java.util.Arrays;

public class RotateImage48 {

    public static void rotate(int[][] matrix) {

        int arr_length = matrix.length;

        for (int i=0; i<arr_length; i++){
            for (int j=i; j<arr_length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i=0; i<arr_length; i++){
            for (int j=0; j<(arr_length/2); j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][arr_length-1-j];
                matrix[i][arr_length-1-j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
