import java.util.Stack;

class PostfixToPrefix {
    public static void main(String[] args) {

        String postfix = "953+4*6/-"; 
        System.out.println("postfix : " + postfix);

        Stack<String> stack = new Stack<>();

        for (int i = 0 ; i <postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            }
            else {
                String val2 = stack.pop();
                String val1 = stack.pop();

                String temp = ch + val1 + val2;
                stack.push(temp);
            }
        }

        System.out.println("Prefix : " + stack.pop());
    }
}
