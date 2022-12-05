import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        if (s.length() <= 1) return false;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                if (stack.isEmpty()) return false;

                char out = stack.pop();

                switch (c) {
                    case ')':
                        if (out != '(') return false;
                        break;
                    case ']':
                        if (out != '[') return false;
                        break;
                    case '}':
                        if (out != '{') return false;
                        break;

                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("isParentheses ()[]{} valid: " + isValid("()[]{}"));
        System.out.println("isParentheses (] valid: " + isValid("(]"));
    }
}
