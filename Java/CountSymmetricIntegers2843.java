public class CountSymmetricIntegers2843 {
    public static void main(String[] args) {
        int low = 1, high = 100;
        int result = countSymmetricIntegers(low,high);
        System.out.println(result);
    }
    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            String num = String.valueOf(i);
            if(num.length() % 2 == 0){
                int firstPart = numberCounter(num.substring(0,num.length() / 2));
                int lastPart = numberCounter(num.substring(num.length() / 2, num.length()));

                if(firstPart == lastPart)
                    count++;
            }
        }

        return count;
    }

    public static int numberCounter(String s){
        int count = 0;
        for (char c: s.toCharArray()){
            count = count + (int) c;
        }
        return count;
    }
}
