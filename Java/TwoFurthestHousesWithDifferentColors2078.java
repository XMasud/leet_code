public class TwoFurthestHousesWithDifferentColors2078 {
    public static void main(String[] args) {
        int[] colors = {1,8,3,8,3};
        int result = maxDistance(colors);
        System.out.println(result);
    }
    public static int maxDistance(int[] colors) {
        int maxDifference = 0;

        for (int i = 0; i < colors.length - 1; i++) {
            for (int j = i+1; j < colors.length; j++) {
                if(colors[i] != colors[j]){
                    maxDifference = Math.max(maxDifference,Math.abs(i-j));
                }
            }
        }
        return maxDifference;
    }
}
