package Praktikum10;

public class Surat15 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat15() {
    }

    Surat15 (String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    void tampilkanSurat() {
        System.out.println("ID SURAT        : " + idSurat);
        System.out.println("NAMA MAHASISWA  : " + namaMahasiswa);
        System.out.println("KELAS           : " + kelas);
        System.out.println("JENIS IZIN      : " + (jenisIzin == 'S' ? "Sakit" : "Izin"));
        System.out.println("DURASI          : " + durasi + " hari");
    }
}