public class BasicLL{
    public static void insertAtEnd(Node head,int val){
        Node temp=new Node(val);
        Node t=head;
        while(t.next!=null){
            t=t.next;

        }
        t.next=temp;

    }
    public static void displayRecursive(Node head){
        if(head==null) {
            return;
        }
        System.out.print(head.data+" ");
        displayRecursive(head.next);
    }
    public static void displayRecursiveReverse(Node head){
        if(head==null) {
            return;
        }
        displayRecursiveReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void display(Node head){
        Node temp=head;
         while(temp!=null){
            System.err.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node x=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=x;

       display(a);
       System.out.println();
       displayRecursive(a);
       System.out.println();
       displayRecursiveReverse(a);
       System.out.println();
       insertAtEnd(a, 20);
       display(a);

       System.out.println("\nThe length of Node is :"+length(a));
       
       

    }
}