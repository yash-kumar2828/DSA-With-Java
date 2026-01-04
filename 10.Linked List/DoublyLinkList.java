public class DoublyLinkList{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

     public static void displayRev(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void displayTwo(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head, int x){
        Node t=new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void insertAtTail(Node head, int x){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp; 
    }
    public static void insertAtIndex(Node head, int idx, int val){
        Node s=head;
        for(int i=0;i<idx-1;i++){
            s=s.next;
        }
        Node r=s.next;
        Node t=new Node(val);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }
    public static Node deleteHead(Node head){
        Node newNode=head.next;
        newNode.prev=null;
        return newNode;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(12);
        Node c = new Node(21);
        Node d = new Node(15);
        Node e = new Node(61);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        displayRev(e);
        displayTwo(c);
        Node newHead=insertAtHead(a, 30);
        display(newHead);
        insertAtTail(a, 32);
        display(a);
        insertAtIndex(a, 3, 100);
        display(a);
        Node newHead2=deleteHead(a);
        display(newHead2);
    }
}