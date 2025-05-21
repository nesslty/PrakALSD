package Pralktikum12;

public class Mahasiswa15 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa15 (String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
