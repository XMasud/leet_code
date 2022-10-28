import java.util.Arrays;

public class ConvertOneDimensionToTwoDimension {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result= new int[m][n];

        if( m*n != original.length)
            return new int[0][0];

        for (int i =0; i< original.length; i++){
            int x = i/n;
            int y = i%n;
            result[x][y] = original[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int m = 1;
        int n = 3;

        int[][] result = construct2DArray(arr, m, n);

    }
}
