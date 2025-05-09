public class StringCompression443 {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int result = compress(chars);
        System.out.println(result);
        System.out.println(chars);
    }
    public static int compress(char[] chars) {

        int start = 0, index = 0;

        while (start < chars.length){
            int end = start;
            while (end < chars.length && chars[start] == chars[end]){
                end++;
            }
            int count = end - start;
            chars[index++] = chars[start];

            if(count >= 2){
                char[] countArr = Integer.toString(count).toCharArray();
                for (char c: countArr){
                    chars[index++] = c;
                }
            }
            start = end;
        }

        return index;
    }
}
