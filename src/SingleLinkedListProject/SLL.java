//package SingleLinkedListProject;
//
//public class SLL {
//    Node head, tail;
//    int size = 0;
//
//    void inisialisasi() {
//        head = null;
//    }
//
//    boolean isEmpty() {
//        return (size == 0);
//    }
//
//    int size() {
//        return size;
//    }
//
//    void addFirst(Node input) {
//        if (isEmpty()) {
//            head = input;
//            tail = input;
//        } else {
//            input.next = head;
//            head = input;
//        }
//        size++;
//    }
//
//    void addLast(Node input) {
//        if (isEmpty()) {
//            head = input;
//            tail = input;
//        } else {
//            tail.next = input;
//            tail = input;
//        }
//        size++;
//    }

    //2
//    public static void main(String[] args) {
//        SLL list = new SLL();
//        System.out.println("head : " + list.head);
//        System.out.println("tail : " + list.tail);
//        list.addFirst(new Node());
//        System.out.println("head : " + list.head);
//        System.out.println("tail : " + list.tail);
//        list.addFirst(new Node());
//        System.out.println("head : " + list.head);
//        System.out.println("tail : " + list.tail);
//        list.addLast(new Node());
//        System.out.println("head : " + list.head);
//        System.out.println("tail : " + list.tail);
//    }

    //3
//    public static void main(String[] args) {
//        SLL list = new SLL();
//        System.out.println("head : " + list.head);
//        System.out.println("tail : " + list.tail);
//        list.addLast(new Node());
//        System.out.println("head : " + list.head);
//        System.out.println("tail : " + list.tail);
//        list.addLast(new Node());
//        System.out.println("head : " + list.head);
//        System.out.println("tail : " + list.tail);
//        list.addLast(new Node());
//        System.out.println("head : " + list.head);
//        System.out.println("tail : " + list.tail);
//    }
//}

package SingleLinkedListProject;

public class SLL {
    Node head, tail;
    int size = 0;

    void inisialisasi() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return (size == 0);
    }

    int size() {
        return size;
    }

    void addFirst(Node input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            input.next = head;
            head = input;
        }
        size++;
    }

    void addLast(Node input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
        size++;
    }

    void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
            size--;
            if (isEmpty()) {
                tail = null;
            }
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            size--;
        }
    }

    void insertAt(Node input, int index) {
        if (index < 0 || index > size) {
            System.out.println("Indeks tidak valid!");
        } else if (index == 0) {
            addFirst(input);
        } else if (index == size) {
            addLast(input);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            input.next = current.next;
            current.next = input;
            size++;
        }
    }

    int find(Object data) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(data)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    Node get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid!");
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    void printList() {
        Node current = head;
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.print("Isi List: ");
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    //penambahan utk soal terakhir
    public void insertInOrder(Node input) {
        if (!(input.data instanceof Mahasiswa)) {
            System.out.println("Error: Node harus berisi objek Mahasiswa.");
            return;
        }

        Mahasiswa mhsInput = (Mahasiswa) input.data;

        if (isEmpty() || mhsInput.getIpk() < ((Mahasiswa) head.data).getIpk()) {
            addFirst(input);
            return;
        }

        Node current = head;
        while (current.next != null && ((Mahasiswa) current.next.data).getIpk() < mhsInput.getIpk()) {
            current = current.next;
        }

        input.next = current.next;
        current.next = input;

        if (input.next == null) {
            tail = input;
        }

        size++;
    }
}

