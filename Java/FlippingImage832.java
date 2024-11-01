public class FlippingImage832 {

    public static int numFlip(int num){
        if(num == 0){
            return 1;
        }
        return 0;
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        if(image.length >20)
            return null;

        for (int i = 0; i < image.length; i++) {
           int left = 0;
           int right = image[i].length - 1;

           while (left <= right){

               int temp = image[i][left];
               image[i][left] = numFlip(image[i][right]);
               image[i][right] = numFlip(temp);

               left++;
               right--;
           }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] number = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(number);

        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
