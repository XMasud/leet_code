public class JewelsAndStones771 {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        int result = numJewelsInStones(jewels, stones);
        System.out.println(result);
    }
    public static int numJewelsInStones(String jewels, String stones) {

        int counter = 0;

        for (char c: stones.toCharArray()){
            if(jewels.indexOf(c) > -1){
                counter++;
            }

        }
        return counter;
    }
}
