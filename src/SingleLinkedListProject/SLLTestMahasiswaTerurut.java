package SingleLinkedListProject;

public class SLLTestMahasiswaTerurut {
    public static void main(String[] args) {
        SLL listMahasiswa = new SLL();

        System.out.println("""
                Nama: Edgar Jason Husin
                NIM: 245150201111047
                """);
        System.out.println("--- Tes Penambahan Terurut (method insertInOrder) ---");

        listMahasiswa.insertInOrder(new Node(new Mahasiswa("Zuhdi", "123", 3.85)));
        listMahasiswa.printList();

        listMahasiswa.insertInOrder(new Node(new Mahasiswa("Mutia", "456", 3.92)));
        listMahasiswa.printList();

        listMahasiswa.insertInOrder(new Node(new Mahasiswa("Fahry", "789", 3.55)));
        listMahasiswa.printList();

        listMahasiswa.insertInOrder(new Node(new Mahasiswa("Kevin", "012", 3.88)));
        listMahasiswa.printList();

        System.out.println("\nUkuran list: " + listMahasiswa.size());

    }
}
