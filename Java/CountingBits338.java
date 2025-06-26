import java.util.Arrays;

public class CountingBits338 {
    public static void main(String[] args) {
        int n = 5;
        int[] result = countBits(n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] countBits(int n) {
        int[] res = new int[n+1];

        for (int i = 0; i <=n ; i++) {
            res[i] = oneCount(i);
        }

        return res;
    }

    public static int oneCount(int i){
        int count = 0;

        while(i != 0){
            if((i&1) == 1)
                count++;

            i = i >> 1;
        }

        return count;
    }
}
