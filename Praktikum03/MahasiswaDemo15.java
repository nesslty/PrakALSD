package Praktikum03;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Mahasiswa15[ ] arrayMahasiswa15 = new Mahasiswa15[3];
        arrayMahasiswa15[0] = new Mahasiswa15();
        arrayMahasiswa15[0].nim = "244107060033";
        arrayMahasiswa15[0].nama = "AGNES TITANIA KINANTI";
        arrayMahasiswa15[0].kelas = "SIB-1E";
        arrayMahasiswa15[0].ipk = (float) 3.75;

        arrayMahasiswa15[1] = new Mahasiswa15();
        arrayMahasiswa15[1].nim = "2341720172";
        arrayMahasiswa15[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayMahasiswa15[1].kelas = "TI 2-A";
        arrayMahasiswa15[1].ipk = (float) 3.36;

        arrayMahasiswa15[2] = new Mahasiswa15();
        arrayMahasiswa15[2].nim = "244107023006";
        arrayMahasiswa15[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayMahasiswa15[2].kelas = "TI 2-E";
        arrayMahasiswa15[2].ipk = (float) 3.80;

        System.out.println("NIM     : " + arrayMahasiswa15[0].nim);
        System.out.println("Nama    : " + arrayMahasiswa15[0].nama);
        System.out.println("Kelas   : " + arrayMahasiswa15[0].kelas);
        System.out.println("ipk     : " + arrayMahasiswa15[0].ipk);
        System.out.println(".............................................................................");
        System.out.println("NIM     : " + arrayMahasiswa15[0].nim);
        System.out.println("Nama    : " + arrayMahasiswa15[0].nama);
        System.out.println("Kelas   : " + arrayMahasiswa15[0].kelas);
        System.out.println("ipk     : " + arrayMahasiswa15[0].ipk);
        System.out.println(".............................................................................");
        System.out.println("NIM     : " + arrayMahasiswa15[1].nim);
        System.out.println("Nama    : " + arrayMahasiswa15[1].nama);
        System.out.println("Kelas   : " + arrayMahasiswa15[1].kelas);
        System.out.println("ipk     : " + arrayMahasiswa15[1].ipk);
        System.out.println(".............................................................................");
        System.out.println("NIM     : " + arrayMahasiswa15[2].nim);
        System.out.println("Nama    : " + arrayMahasiswa15[2].nama);
        System.out.println("Kelas   : " + arrayMahasiswa15[2].kelas);
        System.out.println("ipk     : " + arrayMahasiswa15[2].ipk);
        System.out.println(".............................................................................");
    }
}
