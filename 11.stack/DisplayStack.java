import java.util.Stack;

class DisplayStack{
    public static void displayRec(Stack<Integer> st, int index){
        if(index<0){
            return;
        }
        System.out.println(st.get(index));
        displayRec(st, index-1);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(76);
        st.push(31);
        st.push(65);
        st.push(94);
        st.push(15);
        System.out.println("Stack elements are:");
        for(int i=st.size()-1;i>=0;i--){
            System.out.println(st.get(i));
        }
        System.out.println("Stack elements using recursion:");
        displayRec(st, st.size()-1);
    }
}