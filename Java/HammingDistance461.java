public class HammingDistance461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {
        int count = 0;

        String xOne = Integer.toBinaryString(x);
        String yOne = Integer.toBinaryString(y);

        int maxLength = Math.max(xOne.length(), yOne.length());
        xOne = String.format("%" + maxLength + "s", xOne).replace(' ', '0');
        yOne = String.format("%" + maxLength + "s", yOne).replace(' ', '0');

        for (int i = 0; i < xOne.length(); i++) {
            if(xOne.charAt(i) != yOne.charAt(i))
                count++;
        }

        return count;
    }
}
