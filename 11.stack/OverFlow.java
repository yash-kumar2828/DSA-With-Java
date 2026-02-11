
class OverFlow{
    public static class Stack{
        int[] arr =new int[5];
        int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        
        } 
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1]; 
        } 
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }      
        int size(){
            return idx;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            return idx==0;
        }

        boolean isFull(){
            return idx==arr.length;
        }
        
    }
        
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(76);
        st.push(31);
        st.push(65);
        st.push(94);
        st.push(15);    
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.peek());
        st.push(74);
        st.display();
        st.push(79);
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
    }
}
