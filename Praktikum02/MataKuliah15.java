package Praktikum02;

public class MataKuliah15 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("..........................................................................");
        System.out.println("Kode Mata Kuliaha               : " + kodeMK);
        System.out.println("Nama Mata Kuliah                : " + nama);
        System.out.println(" SKS                            : " + sks);
        System.out.println("Total jam pertemuan per minggu  : " + jumlahJam);
        System.out.println("..........................................................................");
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam pada mata kuliah " + nama + " bertambah menjadi " + jumlahJam + " jam");
    }
    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam pada mata kuliah" + nama + " berkurang menjadi " + jumlahJam + " jam");
        } else {
            System.out.println("Gagal!");
        }
    }
    public MataKuliah15 () {
    }
    public MataKuliah15 (String kmk, String nm, int sks, int jujam) {
        kodeMK = kmk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jujam;
    }
}
