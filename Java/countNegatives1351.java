public class countNegatives1351 {

    public static int countNegatives(int[][] grid){
        int count = 0;

        for (int i=0; i< grid.length; i++){
          for (int j=0; j< grid[i].length; j++){
              if(grid[i][j] < 0){
                  count++;
              }
          }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {{5,1,0},{-5,-5,-5}};

        int result = countNegatives(matrix);

        System.out.println(result);
    }
}
