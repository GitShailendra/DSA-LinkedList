public class Prob02 {
     public class Node {
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
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void removeNode(int n){
        Node temp = head;
        int i=1;
        while (i<(size-n)) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        
    }
    public static void main(String[] args) {
        Prob02 ll = new Prob02();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        // System.out.println(ll.size);
        // ll.removeNode(3);
        // ll.print();
    }
}
