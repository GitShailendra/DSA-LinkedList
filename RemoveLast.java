public class RemoveLast {
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
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }else if(size==1){
            head=tail=null;
            size--;
            return;
        }
        head= head.next;
        size--;
    }
    public void removeLast() {
        if(size==0){
            System.out.println("LL is empty");
            return;
        }else if(size==1){
            head=tail=null;
            size--;
            return;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
    }
    public static void main(String[] args) {
        RemoveLast ll = new RemoveLast();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        System.out.println("size of ll is "+ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeFirst();
        // ll.print();
    }
}
