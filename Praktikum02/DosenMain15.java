package Praktikum02;

public class DosenMain15 {
    public static void main(String[] args) {
        Dosen15 dsn1 = new Dosen15();

        dsn1.idDosen = "VAL00001";
        dsn1.nama = "Vivin Ayu Lestari";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2000;
        dsn1.bidangKeahlian = "ALSD";

        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(true);
        dsn1.ubahKeahlian("PrakALSD");
        System.out.println("Masa kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");

        Dosen15 dsn2 = new Dosen15("WID00002", "Widaningsih Condrowardhani", false, 2020, "Kewarganegaraan");
        
        dsn2.tampilkanInformasi();
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Matkul Kewarganegaraan");
        System.out.println("Masa kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        System.out.println("....................................................................................................");
    }   
}
