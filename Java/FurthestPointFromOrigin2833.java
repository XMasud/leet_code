import javax.swing.text.MutableAttributeSet;

public class FurthestPointFromOrigin2833 {
    public static void main(String[] args) {
        String moves = "R";
        int result = furthestDistanceFromOrigin(moves);
        System.out.println(result);
    }
    public static int furthestDistanceFromOrigin(String moves) {

        int leftMoves = 0;
        int rightMoves = 0;

        for (char c: moves.toCharArray()){

            if(c == 'L'){
                leftMoves++;
            } else if (c == 'R') {
                leftMoves--;
            }else {
                leftMoves++;
            }

            if(c == 'L'){
                rightMoves--;
            } else if (c == 'R') {
                rightMoves++;
            }else {
                rightMoves++;
            }
        }

        return Math.max(Math.abs(leftMoves),Math.abs(rightMoves));
    }
}
