public class NumberComplement476 {
    public static void main(String[] args) {
        int num = 1;
        int result = findComplement(num);
        System.out.println(result);
    }

    private static int findComplement(int num) {
        String binaryNum = Integer.toBinaryString(num);
        StringBuilder str = new StringBuilder();

        for(char c: binaryNum.toCharArray()){
            if(c == '1'){
                str.append('0');
            }else
                str.append('1');
        }

        return Integer.parseInt(str.toString(),2);
    }
}
