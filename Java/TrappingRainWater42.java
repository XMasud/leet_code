import java.util.Arrays;

public class TrappingRainWater42 {
    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        int height = trap(heights);
        System.out.println(height);
    }
    public static int trap(int[] height) {
        int total = 0;
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
            rightMax[n-i-1] = Math.max(rightMax[n-i],height[n-i-1]);
        }

        for (int i = 0; i < height.length; i++) {
            total = total + ((Math.min(leftMax[i], rightMax[i])) - height[i]);
        }

        return total;
    }
}
