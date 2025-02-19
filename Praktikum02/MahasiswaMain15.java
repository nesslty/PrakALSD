package Praktikum02;

public class MahasiswaMain15 {
    public static void main(String[] args) {

        Mahasiswa15 mhsl = new Mahasiswa15();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;
        mhsl.tampilkanInformasi();

        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa15 mhs2 = new Mahasiswa15("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa15 mhsNety = new Mahasiswa15("Nety Sulistyorini", "244107060042", 3.77, "SIB 1D");
        mhsNety.updateIpk(3.88);
        mhsNety.tampilkanInformasi();
    }
}
