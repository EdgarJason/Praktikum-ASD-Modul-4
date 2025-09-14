package SingleLinkedListProject;

public class SLLTest {

    public static void main(String[] args) {
        System.out.println("Nama: Edgar Jason Husin");
        System.out.println("NIM: 245150201111047\n");

        SLL list = new SLL();
        System.out.println("--- Inisialisasi dan Cek Kosong ---");
        System.out.println("Apakah list kosong? " + list.isEmpty());
        System.out.println("Ukuran list: " + list.size());
        System.out.println("====================================\n");

        System.out.println("--- Uji Penambahan (addFirst & addLast) ---");
        list.addFirst(new Node("B"));
        list.addFirst(new Node("A"));
        list.addLast(new Node("C"));
        list.printList();
        System.out.println("Ukuran list: " + list.size());
        System.out.println("====================================\n");

        System.out.println("--- Uji Penyisipan (insertAt) ---");
        list.insertAt(new Node("D"), 1);
        list.printList();
        System.out.println("Ukuran list: " + list.size());
        System.out.println("====================================\n");

        System.out.println("--- Uji Pencarian (find) ---");
        System.out.println("Posisi elemen 'B': " + list.find("B"));
        System.out.println("Posisi elemen 'Z': " + list.find("Z"));
        System.out.println("====================================\n");

        System.out.println("--- Uji Pengaksesan (get) ---");
        Node node = list.get(2);
        if (node != null) {
            System.out.println("Data pada indeks 2: " + node.data);
        }
        System.out.println("====================================\n");

        System.out.println("--- Uji Penghapusan (removeFirst & removeLast) ---");
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        System.out.println("Ukuran list: " + list.size());
        System.out.println("====================================\n");

        System.out.println("--- Uji Inisialisasi Ulang ---");
        list.inisialisasi();
        list.printList();
        System.out.println("Ukuran list: " + list.size());
    }
}
