public class ModifyTheMatrix3033 {
    public static void main(String[] args) {
        //int[][] matrix = {{1,2,-1},{4,-1,6},{7,8,9}};
        int[][] matrix = {{2,-1,2,-1,2},{1,0,-1,2,-1},{2,-1,-1,-1,2},{2,1,2,-1,2},{0,1,0,0,0},{0,0,0,0,-1},{2,-1,2,2,0},{0,1,0,2,2},{2,2,0,1,-1}};
        int[][] result = modifiedMatrix(matrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static int[][] modifiedMatrix(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i <col; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < row; j++) {
                max = Math.max(max, matrix[j][i]);
            }

            for (int j = 0; j < row; j++) {
                if(matrix[j][i] == -1){
                    matrix[j][i] = max;
                }
            }
        }
        return matrix;
    }
}
