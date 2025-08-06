public class SizeOfLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void remove(int idx){
        if(idx==0){
            System.out.println("Ll is already empty");
            return;
        }
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;

        }
        temp.next = temp.next.next;
        size--;
    }
    public static void main(String[] args) {
        SizeOfLL ll = new SizeOfLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.remove(2);
        ll.print();
        System.out.println("the size of given ll is "+ ll.size);
        
    }
}
