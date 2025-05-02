public class CountAndSay38 {
    public static void main(String[] args) {
        String result = countAndSay(4);
    }
    public static String countAndSay(int n) {

        if(n < 1)
            return "";
        String result = "1";
        for (int i = 1; i < n ; i++) {
            result = countSayGenerator(result);
        }
        return result;
    }

    public static String countSayGenerator(String result){

        StringBuilder sb = new StringBuilder();
        int count = 1;
        char lastChar = result.charAt(0);

        for (int i = 1; i < result.length(); i++) {
            if(result.charAt(i) == lastChar){
                count++;
            }else {
                sb.append(count);
                sb.append(lastChar);
                lastChar = result.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(lastChar);

        return sb.toString();
    }
}
