package Praktikum02;

public class DosenMain15 {
    public static void main(String[] args) {
        Dosen15 dsn1 = new Dosen15();

        dsn1.idDosen = "VAL00001";
        dsn1.nama = "Vivin Ayu Lestari";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2000;
        dsn1.bidangKeahlian = "ALSD";

        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("PrakALSD");
        System.out.println("Masa kerja: " + dsn1.hitungMasaKerja(2025) + "tahun");
        Dosen15 dsn2 = new Dosen15("AFP00002", "Adevian FAiruz Pratama", true, 2020, "Matematika Dasar");
        
        dsn2.tampilkanInformasi();
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Matematika Lanjut");
        System.out.println("Masa kerja: " + dsn2.hitungMasaKerja(2025));
        System.out.println("..............................................................");
    }   
}
