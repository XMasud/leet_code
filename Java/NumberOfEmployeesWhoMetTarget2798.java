public class NumberOfEmployeesWhoMetTarget2798 {
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        int result = numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println(result);
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for(int hour: hours){
            if(hour >= target)
                count++;
        }
        return count;
    }
}
