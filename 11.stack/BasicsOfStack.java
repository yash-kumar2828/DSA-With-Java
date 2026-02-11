import java.util.Stack;

class BasicsOfStack{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty()); //check the stack is empty then return true
        st.push(76);
        st.push(31);
        st.push(65);
        st.push(94);
        st.push(15);

        System.out.println(st.isEmpty()); //check the stack is non empty then return false

        System.out.println(st.peek());  //access the top value

        System.out.println(st);  //print the all value of stack

        st.pop(); //delete the top value
        System.out.println(st);

        st.pop(); //delete the top value
        System.out.println(st);

        System.out.println("Size is:"+st.size());

        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
    }
}