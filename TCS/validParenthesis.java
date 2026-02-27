import java.util.*;
public class validParenthesis {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean isValid = true;

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (s.isEmpty()) {
                    isValid = false;
                    break;
                }
                int top = stack.pop();
                if (ch == ')' && top != '(') isValid = false;
                if (ch == ']' && top != '[') isValid = false;
                if (ch == '}' && top != '{') isValid = false;

                if (!isValid) break;
            }

        }
        if (!stack.isEmpty()) isValid = false;
        System.out.print(isValid);
    }
}