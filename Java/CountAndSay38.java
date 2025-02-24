public class CountAndSay38 {
    public static void main(String[] args) {
        String result = countAndSay(4);
        //System.out.println(result);
    }
    public static String countAndSay(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if(i == 1){
                result.append(1);
            }else {

                int temp = Integer.parseInt(result.toString());
                int dividend = temp / 10;
                int reminder = temp % 10;

                result = new StringBuilder();
                if(dividend > 0){
                    result.append(reminder+dividend);
                }else{
                    result.append(10+reminder);
                }
                System.out.println(i+ " - "+ result.toString());
            }
        }

        return result.toString();
    }
}
