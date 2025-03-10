public class ChessboardSquaresHaveTheSameColor3724 {
    public static void main(String[] args) {
        String coordinate1 = "a1", coordinate2 = "c3";
        boolean result = checkTwoChessboards(coordinate1, coordinate2);
        System.out.println(result);
    }

    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        String one = getColor(coordinate1);
        String two = getColor(coordinate2);

        return one.equals(two);
    }

    public static String getColor(String coordinate) {

        char[] coordinateArray = coordinate.toCharArray();
        String color = "";

        int xa = coordinateArray[0] - 'a';
        int xcol = coordinateArray[1] - '0';
        if (xa % 2 != 0) {

            if (xcol % 2 != 0) {
                color = "black";
            } else
                color = "white";
        } else {

            if (xcol % 2 != 0) {
                color = "white";
            } else
                color = "black";
        }

        return color;
    }
}
