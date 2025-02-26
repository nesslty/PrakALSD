package Praktikum03;

public class Mahasiswa15 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
    Mahasiswa15[ ] arrayMahasiswa15 = new Mahasiswa15[3];

    void tampilkanInformasi() {
    
    for (int i = 0; i < 3; i++) {
            System.out.println("............................................................................");
            System.out.println("DATA MAHASISWA KE-" + (i + 1));
            System.out.println("NIM     : " + arrayMahasiswa15[i].nim);
            System.out.println("Nama    : " + arrayMahasiswa15[i].nama);
            System.out.println("Kelas   : " + arrayMahasiswa15[i].kelas);
            System.out.println("IPK     : " + arrayMahasiswa15[i].ipk);
        }
    }
}
