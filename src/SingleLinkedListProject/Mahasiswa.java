package SingleLinkedListProject;

public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public double getIpk(){
        return ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return "[" + nama + "/" + nim + "/" + ipk+"]";
    }

}
