import java.util.Stack;

class PrefixToPostfix {
    public static void main(String[] args) {

        String prefix = "-9/*+5346";
        System.out.println("Prefix : " + prefix);

        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            }
            else {
                String val1 = stack.pop();
                String val2 = stack.pop();

                String temp = val1 + val2 + ch;
                stack.push(temp);
            }
        }

        System.out.println("Postfix : " + stack.pop());
    }
}
