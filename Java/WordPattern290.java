import java.util.HashMap;

public class WordPattern290 {
    public static void main(String[] args) {
        String s = "dog cat cat dog";
        String pattern = "abba";
        boolean result = wordPattern(pattern, s);
        System.out.println(result);
    }

    private static boolean wordPattern(String pattern, String s) {

        String[] strList = s.split(" ");

        if (strList.length != pattern.length()) return false;

        HashMap<Character, String> record = new HashMap<Character, String>();

        char[] patternChar = pattern.toCharArray();

        for (int i = 0; i < patternChar.length; i++) {
            char p = patternChar[i];
            if (record.containsKey(p) ) {
                if(!record.get(p).equals(strList[i])){
                    return false;
                }
            }else{
                if(record.containsValue(strList[i])){
                    return false;
                }
                record.put(p, strList[i]);
            }
        }

        return true;
    }
}
