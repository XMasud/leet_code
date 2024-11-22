class Node{
    int data;
    Node next;
}

class LinkedList{
    static Node head;
    public void insert(int data){

        Node node = new Node();
        node.data = data;

        if(head == null){
            head = node;
        }else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void print(){
        Node node = head;

        while (node.next != null){
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
        list.insert(12);

        list.print();

    }
}
