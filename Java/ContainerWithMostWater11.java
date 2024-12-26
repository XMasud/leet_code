public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(height);
        System.out.println(result);
    }

    private static int maxArea(int[] height) {

        if(height.length < 2) return 0;

        int max = Integer.MIN_VALUE;

        int start = 0, end = height.length - 1;

        while (start < end){
            int area = Math.abs(start - end) * Math.min(height[start], height[end]);
            if(area > max){
                max = area;
            }
            if(height[start] > height[end]){
                end--;
            }else
                start++;
        }

        return max;
    }
}
