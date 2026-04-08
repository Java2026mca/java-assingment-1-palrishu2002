import java.util.*;

public class Main {

    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.trim().split("\\s+");

        for (String token : tokens) {

            // If number → push
            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } 
            // If operator → pop and calculate
            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // IMPORTANT: take input from grader
        String exp = sc.nextLine();

        // IMPORTANT: print ONLY result (no "Result:")
        System.out.println(evaluatePostfix(exp));
    }
}