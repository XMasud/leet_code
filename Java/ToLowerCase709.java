public class ToLowerCase709 {
    public static void main(String[] args) {
        String s = "LOVELY";
        String result = toLowerCaseProblem(s);
        System.out.println(result);
    }

    private static String toLowerCaseProblem(String s) {

        if (s.isEmpty())
            return null;

        StringBuilder newVal = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);

            if (c >= 65 && c <= 90) {
                newVal.append((char) (c + 32));
            } else {
                newVal.append((char) c);
            }
        }
        return newVal.toString();
    }
}
