import java.util.Scanner;
import java.util.Stack;

class BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } 
            else if (ch == ')') {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the parenthesis:");
        String str = input.nextLine();
        System.out.println(isBalanced(str));
    }
}
