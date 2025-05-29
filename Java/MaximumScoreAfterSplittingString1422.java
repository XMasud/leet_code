public class MaximumScoreAfterSplittingString1422 {
    public static void main(String[] args) {
        String s = "011101";
        int max = maxScore(s);
        System.out.println(max);
    }
    public static int maxScore(String s) {
        int max = Integer.MIN_VALUE;


        for (int i=0; i< s.length()-1; i++) {

            int left = stringCount(s.substring(0,i+1),'0');
            int right = stringCount(s.substring(i+1,s.length()),'1');

            if(left + right > max)
                max = left + right;
        }

        return max;
    }

    public static int stringCount(String s, char c){
        int count = 0;

        for (char ch: s.toCharArray())
            if(c == ch)
                count++;

        return count;
    }
}
