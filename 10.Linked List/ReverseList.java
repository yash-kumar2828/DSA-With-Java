public class ReverseList{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        display(head.next);
    }
    public static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void reverseDisplay(Node head){
        if(head==null) return;
        reverseDisplay(head.next);
        System.out.print(head.val+" ");
    }

    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(90);
        Node c=new Node(80);
        Node d=new Node(70);
        Node e=new Node(60);
        Node f=new Node(50);
        Node g=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        display(a);
        System.out.println();
        reverseDisplay(a);
        System.out.println();
        Node r=reverse(a);
        display(r);
    }
}