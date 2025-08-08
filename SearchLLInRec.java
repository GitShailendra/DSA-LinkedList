public class SearchLLInRec {
    
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
            temp= temp.next;
        }
        System.out.println("null");
    }
    public int searchInLL(int key){
        Node temp = head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
    public int helper(Node head,int key){
       if(head==null){
        return -1;
       }
       if(head.data==key){
        return 0;
       }
       int idx = helper(head.next,key);
       if(idx==-1){
        return -1;
       }
       return idx+1;

    }
    public static void main(String[] args) {
        SearchLLInRec ll = new SearchLLInRec();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        System.out.println(ll.helper(head, 3));
    }



}
