class LL {
    public static void main(String[] args) {
        // LL list1 = new LL();
        // list1.insert_doubly(12);
        // list1.insert_doubly(13);
        // list1.insert_doubly(14);
        // list1.insert_doubly(15);
        // list1.doubly_display();
        LL list=new LL();
        list.insert(9);
        list.insert(8);
        list.insert(7);
        list.insert(6);
        list.atend(10);
        list.at_before(12);
        list.at_after(16);
        list.bigen_delete();
        list.delete(8);
        list.end_delete();
        list.reverse();
        list.display();

        // node.data=7;
        // System.out.println(node2.data);
    }

    Node head;
    Node1 start;

    public void insert_doubly(int data) {
        // Node1 temp=head1;
        Node1 temp2 = new Node1(data);
        if (start == null) {
            start = temp2;
            return;
        }
        temp2.next = start;
        start.prev = temp2;
        start = temp2;
    }
    public void reverse(){
        // 2->3->4->5->6->null
        // while(current!=null)
        // {
        //     current.next = previous;
            
        //     previous=current;
        //     current=succ;
        //     if(current == null) break;
        //     succ=succ.next;
               
        // }
        Node temp = head;
        Node per=null;
        Node next=head.next;
        while(temp!= null)
        {
            temp.next=per;
            per=temp;
            temp=next;
            if(temp==null)
            {
                break;
            }
            next= next.next;
        } 
        while (per.next!= null){
            System.out.print(per.data + " -> ");
            per= per.next;
        }
    }

    public void doubly_display() {
        Node1 temp = start;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    public void insert(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public void at_after(int data) {
        Node temp = head;
        Node temp2 = new Node(data);
        while (temp.next != null) {
            if (temp.data == 8) {
                Node temp3 = temp.next;
                temp.next = temp2;
                temp2.next = temp3;
            }
            temp = temp.next;
        }
    }

    public void delete(int data) {
        Node temp = head;
        if (head.data == data) {
            head = head.next;
        }
        while (temp.next != null) {
            if (temp.next.data == data) {
                Node temp3 = temp.next;
                temp.next = temp3.next;
            }
            temp = temp.next;
        }
    }

    public void bigen_delete() {
        head = head.next;
    }

    public void end_delete() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void at_before(int data) {
        Node temp = head;
        Node temp2 = new Node(data);
        while (temp.next != null) {
            if (temp.next.data == 8) {
                Node temp3 = temp.next;
                temp.next = temp2;
                temp2.next = temp3;
            }
            temp = temp.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public void atend(int data) {
        Node temp = head;
        Node temp2 = new Node(data);
        if (head == null) {
            head = temp2;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = temp2;

        }
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Node1 {
        int data;
        Node1 next;
        Node1 prev;

        Node1(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
