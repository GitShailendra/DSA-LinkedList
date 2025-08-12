public class DeletNodeByValue {
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
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteByValue(int data) {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }

        // If head node is the one to delete
        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            if (curr.data == data) {
                prev.next = curr.next;

                // If deleting the last node, update tail
                if (curr == tail) {
                    tail = prev;
                }

                size--;
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Value not found in list");
    }

    public static void main(String[] args) {
        DeletNodeByValue ll = new DeletNodeByValue();
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(1);

        ll.print(); // 1->3->2->4->null

        ll.deleteByValue(3);
        ll.print(); // 1->2->4->null

        ll.deleteByValue(1);
        ll.print(); // 2->4->null

        ll.deleteByValue(4);
        ll.print(); // 2->null

        ll.deleteByValue(5); // Not found
    }
}
