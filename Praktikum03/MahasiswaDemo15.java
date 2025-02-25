package Praktikum03;

import java.util.Scanner;
public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa15[ ] arrayMahasiswa15 = new Mahasiswa15[3];
        String dummy;

        
        System.out.println();

        for (int i = 0; i < 3; i++) {
            arrayMahasiswa15[i] = new Mahasiswa15();

            System.out.println("____________________________________________________________________________");
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayMahasiswa15[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayMahasiswa15[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayMahasiswa15[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayMahasiswa15[i].ipk = Float.parseFloat(dummy);
        }
        System.out.println("____________________________________________________________________________");

        System.out.println();
        System.out.println();
        System.out.println(".............................................................................");
        System.out.println("RINCIAN DAFTAR MAHASISWA 1-3");

        for (int i = 0; i < 3; i++) {

            System.out.println(".............................................................................");
            System.out.println("DATA MAHASISWA KE-" + (i + 1));
            System.out.println("NIM     : " + arrayMahasiswa15[i].nim);
            System.out.println("Nama    : " + arrayMahasiswa15[i].nama);
            System.out.println("Kelas   : " + arrayMahasiswa15[i].kelas);
            System.out.println("IPK     : " + arrayMahasiswa15[i].ipk);
        }
            System.out.println(".............................................................................");
        // arrayMahasiswa15[0] = new Mahasiswa15();
        // arrayMahasiswa15[0].nim = "244107060033";
        // arrayMahasiswa15[0].nama = "AGNES TITANIA KINANTI";
        // arrayMahasiswa15[0].kelas = "SIB-1E";
        // arrayMahasiswa15[0].ipk = (float) 3.75;

        // arrayMahasiswa15[1] = new Mahasiswa15();
        // arrayMahasiswa15[1].nim = "2341720172";
        // arrayMahasiswa15[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrayMahasiswa15[1].kelas = "TI 2-A";
        // arrayMahasiswa15[1].ipk = (float) 3.36;

        // arrayMahasiswa15[2] = new Mahasiswa15();
        // arrayMahasiswa15[2].nim = "244107023006";
        // arrayMahasiswa15[2].nama = "DIRHAMAWAN PUTRANTO";
        // arrayMahasiswa15[2].kelas = "TI 2-E";
        // arrayMahasiswa15[2].ipk = (float) 3.80;

        // System.out.println("NIM     : " + arrayMahasiswa15[0].nim);
        // System.out.println("Nama    : " + arrayMahasiswa15[0].nama);
        // System.out.println("Kelas   : " + arrayMahasiswa15[0].kelas);
        // System.out.println("ipk     : " + arrayMahasiswa15[0].ipk);
        // System.out.println(".............................................................................");
        // System.out.println("NIM     : " + arrayMahasiswa15[0].nim);
        // System.out.println("Nama    : " + arrayMahasiswa15[0].nama);
        // System.out.println("Kelas   : " + arrayMahasiswa15[0].kelas);
        // System.out.println("ipk     : " + arrayMahasiswa15[0].ipk);
        // System.out.println(".............................................................................");
        // System.out.println("NIM     : " + arrayMahasiswa15[1].nim);
        // System.out.println("Nama    : " + arrayMahasiswa15[1].nama);
        // System.out.println("Kelas   : " + arrayMahasiswa15[1].kelas);
        // System.out.println("ipk     : " + arrayMahasiswa15[1].ipk);
        // System.out.println(".............................................................................");
        // System.out.println("NIM     : " + arrayMahasiswa15[2].nim);
        // System.out.println("Nama    : " + arrayMahasiswa15[2].nama);
        // System.out.println("Kelas   : " + arrayMahasiswa15[2].kelas);
        // System.out.println("ipk     : " + arrayMahasiswa15[2].ipk);
        // System.out.println(".............................................................................");
        sc.close();
    }
}
