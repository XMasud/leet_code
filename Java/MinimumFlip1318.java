public class MinimumFlip1318 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int result = minFlips(a,b,c);
        System.out.println(result);
    }
    public static int minFlips(int a, int b, int c) {
        int flip = 0;

        while (a !=0 || b !=0 || c != 0){
            if((c&1) == 1){
                if((a&1) == 0 && (b&1) == 0){
                    flip++;
                }
            }else{
                if((a&1) == 1)
                    flip++;
                if((b&1) == 1)
                    flip++;
            }
            a = a>>1;
            b = b>>1;
            c = c>>1;
        }
        return flip;
    }
}
