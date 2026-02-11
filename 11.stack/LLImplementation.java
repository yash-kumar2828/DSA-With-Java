
class LLImplementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class LLStack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }    
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=head.data;
            head=head.next;
            size--;
            return top;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
        void displayRac(Node h){
            if(h==null){
                System.out.println();
                return;
            }
            displayRac(h.next);
            System.out.print(h.data+" ");
        }
        void display(){
            displayRac(head);
            
        }
      
        int size(){
            return size;
        }
        boolean isEmpty(){
            return head==null;
        }

    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(76);
        st.push(31);
        st.push(65);
        st.push(94);
        st.push(15);
        st.display();
        System.out.println("\nSize of stack is: "+st.size());
        st.pop();
        st.display();
        System.out.println("\nTop element is: "+st.peek());
        st.push(74);
        st.display();
        st.push(79);
        System.out.println(st.isEmpty());
    }
}
