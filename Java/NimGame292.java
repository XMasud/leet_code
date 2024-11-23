public class NimGame292 {
    public static boolean canWinNim(int n) {

        if(n % 4 == 0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        int num = 2;
        boolean res = canWinNim(num);
        System.out.println(res);
    }
}
