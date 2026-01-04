public class MiddleValueForNode{
    public Node middleNode(Node head){
        Node slow=head;
        Node fast=head;
        while( fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node deletemiddle(Node head){
        if(head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while (fast.next.next!=null && fast.next.next.next!=null) { 
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(90);
        Node c=new Node(80);
        Node d=new Node(70);
        Node e=new Node(60);
        Node f=new Node(50);
        Node g=new Node(100);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;

        MiddleValueForNode obj=new MiddleValueForNode();

        display(a);
        System.out.println();
        Node middle=obj.middleNode(a);
        System.out.println("The middle value for the Node:"+middle.data);


        obj.deletemiddle(a);
        display(a);

    }
}