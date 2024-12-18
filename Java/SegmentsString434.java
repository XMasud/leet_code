public class SegmentsString434 {
    public static void main(String[] args) {
        String s = "    foo    bar";
        int result = countSegments(s);
        System.out.println(result);
    }

    private static int countSegments(String s) {
        if (s.isEmpty())
            return 0;

        int count = 0;
        String[] words = s.split(" +");

        for(String word: words ){
            if(!word.isEmpty()){
                count++;
            }
        }

        return count;
    }
}
