public class FindTheTownJudge997 {
    public static int findJudge(int n, int[][] trust) {

        if (trust.length < 1)
            return -1;

        int[] inRecord = new int[n+1];
        int[] outRecord = new int[n+1];

        for (int[] arr: trust) {
            inRecord[arr[0]]++;
            outRecord[arr[1]]++;
        }

        for (int i = 1; i < n+1; i++) {
            System.out.println(i+" -> "+inRecord[i]+ " - "+ outRecord[i]);
        }

        for (int i = 1; i <= n ; i++) {
            if (inRecord[i] == 0 && outRecord[i] == n - 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] trust = {{1,2}};
        int result = findJudge(2, trust);
        System.out.println(result);
    }
}
