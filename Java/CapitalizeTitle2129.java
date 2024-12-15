public class CapitalizeTitle2129 {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        String result = capitalizeTitle(title);
        System.out.println(result);
    }

    private static String capitalizeTitle(String title) {

        if (title.isEmpty())
            return null;

        String[] words = title.split(" ");
        StringBuilder newVal = new StringBuilder();

        for (String word : words) {

            if (word.length() < 3) {
                newVal.append(word.toLowerCase() + " ");
            } else {
                String sb = Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length()).toLowerCase() + " ";
                newVal.append(sb);
            }
        }

        return newVal.toString().trim();
    }
}
