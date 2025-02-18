package Praktikum02;

public class MataKuliah15 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliaha: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println(" SKS: " + sks);
        System.out.println("Total jam pertemuan per minggu : " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jamTambah) {
        jumlahJam = jamTambah;
    }
    void kurangiJam(int jamKurang) {
        
    }

}
