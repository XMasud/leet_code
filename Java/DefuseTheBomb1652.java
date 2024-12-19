public class DefuseTheBomb1652 {
    public static void main(String[] args) {
        int[] code = {5,7,1,4};
        int[] result = decryptCode(code, 3);
        for (int r: result){
            System.out.println(r);
        }
    }

    private static int[] decryptCode(int[] code, int k) {

        int[] result = new int[code.length];

        if(k == 0)
            return result;

        int start = 1, end = k, sum = 0;

        if(k < 0){
            start = code.length - Math.abs(k);
            end = code.length - 1;
        }

        for (int i = start; i <= end ; i++) {
            sum = sum + code[i];
        }

        for (int i = 0; i < code.length; i++) {
            result[i] = sum;
            sum = sum - code[(start) % code.length];
            sum = sum + code[(end + 1) % code.length];
            start++;
            end++;
        }
        return result;
    }
}
