import java.util.Arrays;

public class AssignCookies455 {
    public static void main(String[] args) {
        int[] children = {1,2,3};
        int[] cookies = {1,2};
        int result = findContentChildren(children, cookies);
        System.out.println(result);
    }

    private static int findContentChildren(int[] g, int[] s) {

        if(g.length < 1 || s.length < 1)
            return 0;

        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;
        while (i < g.length && j < s.length){

            if(s[j] >= g[i]){
                i++;
                count++;
            }
            j++;
        }

        return count;
    }
}
