class Implementation{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;

        void insertEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
            tail.next=temp;
            tail=temp;
            }           
        }

        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }

        void insertAtIndex(int index, int val){
            Node t=new Node(val);
            Node temp=head;
            if(index==size()){
                insertEnd(val);
                return;
            }
            else if(index==0){
                insertAtHead(val);
                return;
            }else if(index<0 || index>size()){
                System.out.println("wrong index");
                return;
            }
            for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        int getAt(int index){
            Node temp=head;
            if(index<0 || index>size()){
                System.out.println("\nwrong index");
                return -1;
            }
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteAt(int index){
            if(index==0){
                head=head.next;
                return;
            }
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertEnd(1);
        ll.insertEnd(5);
        ll.insertEnd(10);
        ll.display();
        System.out.println();
        ll.insertEnd(49);
        ll.insertEnd(3);
        ll.display();
        System.out.println();
        ll.insertAtHead(10);
        ll.display();
        System.out.println();
        ll.insertAtIndex(2, 7);
        ll.display();
        System.out.println();
        ll.insertAtIndex(0, 101);
        ll.display();
        System.out.println();
        ll.deleteAt(2);
        ll.display();
        System.out.println(ll.getAt(10));
        System.out.println("The size of LinkedList is :"+ll.size());
    }
}