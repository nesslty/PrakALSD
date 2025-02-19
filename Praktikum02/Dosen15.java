package Praktikum02;

public class Dosen15 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi(){
        System.out.println("..............................................................");
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println(" Nama           : " + nama);
        System.out.println("Status aktif    : " + (statusAktif? "Aktif" : "Tidak aktif"));
        System.out.println("Tahun bergabung : " + tahunBergabung);
        System.out.println("Bidang keahlian : " + bidangKeahlian);
        System.out.println("..............................................................");
    }
    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println(nama + " statusnya diubah menjadi " + (status ? "Aktif" : "Tidak Aktif"));
    }
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println(nama + " mengubah bidang keahlian menjadi " + bidang);
    }

    public Dosen15() {
    }
    public Dosen15(String iddos, String nma, boolean statif, int tabung, String bilian) {
        idDosen = iddos;
        nama = nma;
        statusAktif = statif;
        tahunBergabung = tabung;
        bidangKeahlian = bilian;
    }
}
