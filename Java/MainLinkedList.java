class Node {
    int data;
    Node next;
}

class LinkedList {
    static Node head;

    public void insert(int data) {

        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void initialInsert(int data) {
        Node node = new Node();
        node.data = data;

        node.next = head;
        head = node;

    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;

        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;

    }

    public void deleteByValue(int value) {

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node n = head;
        Node temp;
        while (n.next != null) {
            if(n.next.data == value){
                temp = n.next;
                n.next = temp.next;
            }else {
                n = n.next;
            }

        }

    }

    public void print() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(8);
        list.insert(8);
        list.insert(12);

        list.initialInsert(20);
        // list.insertAt(2,16);

        list.deleteByValue(8);

        list.print();

    }
}
