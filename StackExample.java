package ajp_java;


import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push 10 elements into the stack
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println("Stack elements before removal:");
        // (Optional) Print the stack elements before removal

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }

        System.out.println("Stack elements after removal:");
        // Print the remaining elements in the stack

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}