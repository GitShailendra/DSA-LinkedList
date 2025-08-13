public class AddElement{
    public class Node{
        int data ;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;

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
    public static void main(String[] args) {
        AddElement ll = new AddElement();
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.print();
    }
}