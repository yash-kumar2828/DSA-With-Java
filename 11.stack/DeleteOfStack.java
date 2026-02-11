import java.util.Stack;

class DeleteOfStack{
    public static void main(String[] args) {
        {
            Stack<Integer> st=new Stack<>();
            st.push(76);
            st.push(31);
            st.push(65);
            st.push(94);
            st.push(15);
            System.out.println("Stack before deletion:"+st);
            int idx=2; 
            Stack<Integer> temp=new Stack<>();
            while(st.size()>idx){
                temp.push(st.pop());
            }
            st.pop();
            while(!temp.isEmpty()){
                st.push(temp.pop());
            }
            System.out.println("Stack after deletion:"+st);
        }
    }
}