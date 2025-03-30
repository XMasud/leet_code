public class RobotReturnToOrigin657 {
    public static void main(String[] args) {
        String moves = "UD";
        boolean result = judgeCircle(moves);
    }
    public static boolean judgeCircle(String moves) {

        int upDown = 0;
        int rightLeft = 0;

        for (char c: moves.toCharArray()){
            if(c == 'R'){
                rightLeft++;
            } else if (c == 'L') {
                rightLeft--;
            } else if (c == 'U') {
                upDown++;
            } else if (c == 'D') {
                upDown--;
            }
        }

        return (upDown == 0 && rightLeft == 0);
    }
}
