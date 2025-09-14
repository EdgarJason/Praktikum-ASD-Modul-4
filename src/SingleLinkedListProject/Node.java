package SingleLinkedListProject;

public class Node {
    Object data;
    Node next;

    public Node(){

    }

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node head = new Node();

        head.data = "A";

        System.out.println("data : " + head.data);
        System.out.println("pointer: " + head.next);
    }
}
