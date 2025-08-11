public class CheckLlIsPalindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;


        }
        return slow;
    }
    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // find the mid node
        Node mid = findMid(head);
        // reverse the second half of the linked list
        Node prev = null;
        Node curr= mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // compare the first half and the second half
        Node firstHalf = head;
        Node secondHalf = prev; // this is the reversed second half
        while(secondHalf!=null){
            if(firstHalf.data!=secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckLlIsPalindrome ll = new CheckLlIsPalindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.isPalindrome());
    }
}
