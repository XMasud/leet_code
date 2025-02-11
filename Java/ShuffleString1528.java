public class ShuffleString1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String result = restoreString(s, indices);
        System.out.println(result);
    }

    private static String restoreString(String s, int[] indices) {

        if(indices.length == 0) return s;

        char[] chars = new char[indices.length];

        for (int i = 0; i < chars.length; i++) {

            chars[indices[i]] = s.charAt(i);
        }

        return new String(chars);
    }
}
