package Praktikum03;

import java.util.Scanner;
public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen15[ ] arrayDosen15 = new Dosen15[3];
        String kode, dummy, nama;
        boolean jenisKelamin;
        int usia;

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("__________________________________________________________________________________");
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                                          : ");
            kode = sc.nextLine();
            System.out.print("Nama                                          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true = Pria, false = Wanita)   : ");
            dummy = sc.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("Pria");
            System.out.print("Usia                                          : ");
            usia = sc.nextInt();
            sc.nextLine();

            arrayDosen15[i] = new Dosen15(kode, nama, jenisKelamin, usia);
        }

        System.out.println("__________________________________________________________________________________");

        System.out.println();
        System.out.println();
        System.out.println("..................................................................................");
        System.out.println("RINCIAN DAFTAR DOSEN 1-3");
        for (int i = 0; i < 3; i++) {
            System.out.println("..................................................................................");
            System.out.println("Data Dosen " + (i + 1));
            System.out.println("Kode            : " + arrayDosen15[i].kode);
            System.out.println("Nama            : " + arrayDosen15[i].nama);
            System.out.println("Jenis Kelamin   : " + (arrayDosen15[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + arrayDosen15[i].usia + " tahun");
        }
        System.out.println("..................................................................................");
        System.out.println();

        sc.close();
    }
    
}
