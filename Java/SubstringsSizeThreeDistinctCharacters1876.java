import java.util.HashSet;

public class SubstringsSizeThreeDistinctCharacters1876 {
    public static void main(String[] args) {
        String s = "aababcabc";
        int result = countGoodSubstrings(s);
        System.out.println(result);
    }
    public static int countGoodSubstrings(String s) {
        if(s.isEmpty())
            return 0;

        int count = 0;

        for (int i = 0; i < s.length() - 2; i++) {

            char[] newString = s.substring(i,i+3).toCharArray();
            HashSet<Character> maps = new HashSet<>();
            int flag = 0;

            for (char c: newString){
                if(maps.contains(c)){
                    flag = 1;
                    break;
                }else{
                    maps.add(c);
                }
            }

            if(flag == 0){
                count++;
            }
        }

        return count;
    }
}
