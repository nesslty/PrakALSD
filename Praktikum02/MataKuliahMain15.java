package Praktikum02;

public class MataKuliahMain15 {
    public static void main(String[] args) {
        MataKuliah15 matkul1 = new MataKuliah15();

        matkul1.kodeMK = "SIB242005";
        matkul1.nama = "PrakALSD";
        matkul1.sks = 2;
        matkul1.jumlahJam = 6;

        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(1);
        matkul1.tambahJam(4);
        matkul1.kurangiJam(2);
        matkul1.tampilkanInformasi();

        MataKuliah15 matkul2 = new MataKuliah15("SIB242004", "ALSD", 1, 3);

        matkul2.ubahSKS(6);
        matkul2.tambahJam(8);
        matkul2.kurangiJam(2);
        matkul2.tampilkanInformasi();
    }
}
