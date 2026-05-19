package Recursion;

public class SortStock {
import java.util.Stack;

public class SortStack {
    public static void sortStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        insert(stack, top);
    }

    public static void insert(Stack<Integer> stack, int num) {

        if (stack.isEmpty() || stack.peek() <= num) {
            stack.push(num);
            return;
        }

        int top = stack.pop();
        insert(stack, num);

        stack.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
