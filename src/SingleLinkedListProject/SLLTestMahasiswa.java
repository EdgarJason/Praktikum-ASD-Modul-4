package SingleLinkedListProject;

public class SLLTestMahasiswa{
    public static void main(String[] args) {
        System.out.println("""
                Nama: Edgar Jason Husin
                NIM: 245150201111047
                """);

        SLL listMahasiswa = new SLL();

        Mahasiswa mhs1 = new Mahasiswa("Kevi", "12345", 3.85);
        Mahasiswa mhs2 = new Mahasiswa("Umar", "67890", 3.92);
        Mahasiswa mhs3 = new Mahasiswa("Bagas", "11223", 3.55);

        System.out.println("--- Menambahkan Mahasiswa ke SLL ---");
        listMahasiswa.addFirst(new Node(mhs1));
        listMahasiswa.addLast(new Node(mhs2));
        listMahasiswa.addLast(new Node(mhs3));

        listMahasiswa.printList();
        System.out.println("Ukuran list: " + listMahasiswa.size());

        System.out.println("\n--- Akses dan Tampilan Data Mahasiswa ---");
        Node nodeKedua = listMahasiswa.get(1);
        if(nodeKedua != null) {
            Mahasiswa mhs = (Mahasiswa) nodeKedua.data;
            System.out.println("Data mahasiswa pada indeks 1: " + mhs.getNama());
            System.out.println("IPK Mahasiswa: " + mhs.getIpk());
        }

        System.out.println("\n--- Mencari Mahasiswa based on Nama ---");
        int indeksNama = -1;
        Node current = listMahasiswa.head;
        int index = 0;
        while(current != null) {
            Mahasiswa mhs = (Mahasiswa) current.data;
            if (mhs.getNama().equals("Umar")) {
                indeksNama = index;
                break;
            }
            current = current.next;
            index++;
        }
        System.out.println("Posisi Umar dalam list: " + indeksNama);
        System.out.println(" ");

    }
}