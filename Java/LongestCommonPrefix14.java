public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    private static String longestCommonPrefix(String[] strs) {
        
        if(strs.length < 1 || strs[0] == null || strs[0].isEmpty())
            return "";

        if(strs.length == 1)
            return strs[0];

        String common = strs[0];
        int length = Integer.MAX_VALUE;

        for (int i = 1; i < strs.length; i++) {

            String currentWord = strs[i];

            if(currentWord == null || currentWord.isEmpty())
                return "";

            int minimum = 0;

            int j = 0;
            while (j < currentWord.length() && j < common.length() ){
                if(currentWord.charAt(j) == common.charAt(j)){
                    minimum++;
                }else
                    break;
                j++;
            }
            length = Math.min(minimum,length);
        }
        return common.substring(0,length);
    }
}
