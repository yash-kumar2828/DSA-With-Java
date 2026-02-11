import java.util.Stack;

class InsertionOfStack{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(76);
        st.push(31);
        st.push(65);
        st.push(94);
        st.push(15);
        System.err.println("stack before insertion:"+st);
        int idx=2; 
        int val=100; 
        Stack<Integer> temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(val);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.err.println("stack after insertion:"+st);
    }
}