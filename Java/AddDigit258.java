public class AddDigit258 {
    public static int addDigits(int num) {

        if (num == 0) return 0;

        int status = 0;
        int counter = 0;

        while (status == 0){
            counter = num % 10 + num / 10;
            if(counter >= 10){
                num = counter;
            }else {
                status = 1;
                break;
            }

        }

        return counter;
    }
    public static void main(String[] args) {
        int num = 10;
        int result = addDigits(num);
        System.out.println(result);
    }
}
