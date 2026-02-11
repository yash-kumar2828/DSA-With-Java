import java.util.Stack;
class UnderFlow{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
            st.push(76);
            st.push(31);
            st.push(65);
            st.push(94);
            st.push(15);
            System.out.println(st);
            st.pop();
            System.out.println(st);
            st.pop();
            System.out.println(st);
            st.pop();
            System.out.println(st);
            st.pop();
            System.out.println(st);
            st.pop();
            System.out.println(st);
            // st.pop(); //then will throw EmptyStackException
            // System.out.println(st);  
    }
}