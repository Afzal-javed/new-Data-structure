public class Doubly_LL {
    public static void main(String[] args) {
        Doubly_LL list=new Doubly_LL();
        // list.insert_first(1);
        // list.insert_first(2);
        // list.insert_first(3);
        // list.insert_first(4);
        // list.insert_first(5);
        // list.insert_last(0);
        // list.insert_last(-1);
        // list.insert_last(-2);
        // list.insert_last(-3);
        // list.at_mid_before(10);
        // list.at_mid_after(11);
        // list.delete_first();
        // list.delete_end();
        // list.delete_mid(11);
        // list.delete_mid(0);
        list.insert_last(1);
        list.insert_last(2);
        list.insert_last(3);
        list.insert_last(4);
        list.insert_last(5);
        list.insert_last(6);
        list.display();
        list.reverse();
    
        
    }
    Node head;
    public void insert_first(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }else{
            temp.next=head;
            temp.prev=null;
            head=temp;
        }
    }
    public void reverse(){

        //3 -> 4 -> 5 -> 6 -> 7 -> null
        Node temp=head;
        
        while(temp.next!=null){
            
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.prev;
        }
        
           
    }
    public void insert_last(int data){
        Node temp=head;
        Node temp2=new Node(data);
        if(head==null){
            insert_first(data);
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=temp2;
        temp2.prev=temp;
    }
    public void at_mid_before(int data){
        Node temp=head;
        Node temp2=new Node(data);
        if(head==null){
            insert_first(data);
            return;
        }
        while(temp.next!=null){
            if(temp.next.data==2){
                Node temp3=temp.next;
                temp.next=temp2;
                temp2.next=temp3;
                temp2.prev=temp3;

            }
            temp=temp.next;
        }
    }
    public void at_mid_after(int data){
        Node temp=head;
        Node temp2=new Node(data);
        if(head==null){
            insert_first(data);
            return;
        }
        while(temp.next!=null){
            if(temp.data==2){
                Node temp3=temp.next;
                temp.next=temp2;
                temp2.next=temp3;
                temp2.prev=temp3;

            }
            temp=temp.next;
        }
    }
    public void delete_first(){
        head=head.next;
    }
    public void delete_end(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        // temp.prev=temp;
    }
    public void delete_mid(int data){
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==data){
                Node temp2=temp.next.next;
                temp.next=temp2;
                // temp2.prev=temp;
            }
            temp=temp.next;
        }
    }
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("The List is empty");
            return;
        }else{
            while(temp!=null){
                System.out.print(temp.data+ " -> ");
                temp=temp.next;
            }
            System.out.println("END");
        }
    }
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    
}
