

import java.util.Scanner;
import java.util.Stack;

public class Task3d_BracketMatching {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c;
        int i = 0;
        Stack<Character> stack = new Stack<Character>();

        for (i = 0; i < str.length(); i++) {
            c = str.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty()) {
                    System.out.println(false);
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    System.out.println(false);
                }
            } else if (c == '}') {
                if (stack.empty()) {
                    System.out.println(false);
                } else if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    System.out.println(false);
                }
            }
        }
        System.out.println(stack.empty());
    }
}
