package EXO1;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Exercice 1

        Stack<String> stack = new Stack<>();
        stack.push("q");
        stack.push("b");
        stack.push("c");
        stack.push("z");

        System.out.println(stack);

        String reverse = "";
        while (!stack.empty() ) {
            reverse = reverse + stack.pop();
        }
        System.out.println(reverse);
    }
}