public class FaultyKeyBoard2810 {
    public static void main(String[] args) {
        String s = "poiinter";
        String result = finalString(s);
        System.out.println(result);
    }

    private static String finalString(String s) {

        if (s.isEmpty())
            return null;

        StringBuilder newLetter = new StringBuilder();

        for (char c: s.toCharArray()){
            if(c == 'i'){
                newLetter.reverse();
            }else {
                newLetter.append(c);
            }
        }

        return newLetter.toString();
    }
}
