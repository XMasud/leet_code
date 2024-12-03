public class PlaceFlowers605 {
    public static void main(String[] args) {
        int[] flowerBed = {0, 0, 1, 0, 0};
        int n = 1;
        boolean result = canPlaceFlowers(flowerBed, n);
        System.out.println(result);
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) return true;

        int flag = 0;
        int current_count = 0;
        int i = 0;

        while (i < flowerbed.length - 1) {

            if (flowerbed[i] != 1) {
                if (flag != 1 && flowerbed[i + 1] != 1) {
                    current_count++;
                    flag = 1;
                } else {
                    flag = 0;
                }
            } else {
                flag = 1;
            }
            i++;
            if (current_count == n)
                return true;
        }
        if (flag == 0 && flowerbed[flowerbed.length - 1] == 0) {
            current_count++;
        }
        return current_count == n;
    }
}
