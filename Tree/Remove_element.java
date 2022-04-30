public class Remove_element {
    public static void main(String[] args) {
        Remove_element list=new Remove_element();
        list.insert(6);
        list.end(7);
        list.end(8);
        list.end(9);
        list.end(0);
        list.display();
        System.out.println();
        list.newHead();
       
        // list.delete(7);
        list.display();

    }Node head;
    public void insert(int data){
        Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
            temp. next=head;
            head=temp;
            }
    }
    public void end(int data){
        Node temp=head;
        Node temp2=new Node(data);
        if(head==null){
            head=temp2;
        }else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=temp2;
        }
    }
    public void newHead(){
        head=reverse(head);
    }
    public Node reverse(Node start){
        if(start.next==null){
            // head=start;
            // return head;
            return start;
        }
        Node temp=reverse(start.next);
        start.next.next=start;
        start.next=null;
        return temp;
    }
    //1,2,6,3,4,5,6
    // public void delete(int data){
    //     Node temp=head;
    //     // if(head.data==data){
    //     //     head=head.next;
    //     // }else{
    //     while(temp!=null){
    //         if(temp.next.data==data){
    //             Node temp2=temp.next;
    //             temp.next=temp2.next;
    //         }
    //         temp=temp.next;
    //     }
    
    // }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        }
    }
    class Node{
        int data;
        Node next;
        Node (int data){
            this. data=data;
            this. next=null;
        }
    }
    
}
