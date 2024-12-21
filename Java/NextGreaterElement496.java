import java.util.HashMap;

public class NextGreaterElement496 {
    public static void main(String[] args) {
        int[] num1 = {2,4};
        int[] num2 = {1, 2, 3, 4};
        int[] result = nextGreaterElement(num1, num2);
        for (int n : result) {
            System.out.println(n);
        }
    }

    private static int[] nextGreaterElement(int[] num1, int[] num2) {

        int[] result = new int[num1.length];
        HashMap<Integer, Integer> record = new HashMap<>();

        if(num1.length < 1 || num2.length < 1)
            return result;

        for (int i = 0; i < num2.length; i++) {
            record.put(num2[i], i);
        }

        for (int i = 0; i < num1.length; i++) {

            int index = record.get(num1[i]);

            if (index >= 0) {

                index++;
                boolean flag = false;
                while (index < num2.length) {
                    if (num2[index] > num1[i]) {
                        result[i] = num2[index];
                        flag = true;
                        break;
                    }
                    index++;
                }
                if (!flag)
                    result[i] = -1;
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}
