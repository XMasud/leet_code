public class CountPrimeEratosthenes204 {
    public static void main(String[] args) {
        int result = countPrimes(5);
        System.out.println(result);
    }
    public static int countPrimes(int n) {

        if(n <= 2)
            return 0;

        boolean[] primeMap = new boolean[n+1];
        int count = 0;

        primeMap[0] = false;
        primeMap[1] = false;

        for (int i = 2; i <=n ; i++) {
            primeMap[i] = true;
        }

        for (int i = 2; i*i <= n ; i++) {
            for (int j = 2*i; j <= n ; j = j + i) {
                primeMap[j] = false;
            }
        }

        for (int i = 0; i < n; i++) {
            if(primeMap[i]) count++;
        }

        return count;
    }
}
