
import java.util.Scanner;
import java.util.Stack;

class CopyStack{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the element you want to insert:");
        int n=input.nextInt();
        System.out.println("Enter the elements:");
        for(int i=1;i<=n;i++){
            int x=input.nextInt();
            st.push(x);
        }
        System.out.println("Original Stack:");
        System.out.println(st);
        System.out.println("Reverse Stack:");
        Stack<Integer> rt=new Stack<>();
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        System.out.println(rt);

        Stack<Integer> copy=new Stack<>();
        while(!rt.isEmpty()){
            copy.push(rt.pop());
        }
        System.out.println("Copy of Stack:");
        System.out.println(copy);
    }
}