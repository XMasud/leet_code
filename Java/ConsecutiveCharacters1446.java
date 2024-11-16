public class ConsecutiveCharacters1446 {
    public static int maxPower(String s) {

        int maxCount = 1;
        char initialChar = s.charAt(0);
        int localCount = 1;
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentChar == initialChar){
                localCount++;
                maxCount = Math.max(maxCount, localCount);
            }else{
                localCount = 1;
                initialChar = s.charAt(i);
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {
        String str = "covid";
        int result = maxPower(str);
        System.out.println(result);
    }
}
