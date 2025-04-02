import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class NumberStudentsUnableEatLunch1700 {
    public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[]sandwiches = {0,1,0,1};
        int result = countStudents(students,sandwiches);
        System.out.println(result);
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        int count = 0;
        int missed = 0;

        Stack<Integer> sandwichesStack = new Stack<>();
        Queue<Integer> studentQueue = new LinkedList<>();

        for (int student: students){
            studentQueue.add(student);
        }

        for (int i = sandwiches.length - 1; i>= 0; i--) {
            sandwichesStack.push(sandwiches[i]);
        }


        while (!studentQueue.isEmpty() || !sandwichesStack.isEmpty()){
            if(studentQueue.peek() == sandwichesStack.peek()){
                studentQueue.remove();
                sandwichesStack.pop();
                count++;
                missed = 0;
            }else{
                studentQueue.offer(studentQueue.poll());
                missed++;
            }
            if(missed == studentQueue.size())
                break;
        }

        return students.length - count;
    }
}
