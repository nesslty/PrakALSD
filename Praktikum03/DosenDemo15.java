package Praktikum03;

import java.util.Scanner;
public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen15[ ] arrayDosen15 = new Dosen15[3];
        String kode, dummy, nama;
        boolean jenisKelamin;
        int usia, nmr = 1;

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("__________________________________________________________________________________");
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                          : ");
            kode = sc.nextLine();
            System.out.print("Nama                          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita)   : ");
            dummy = sc.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("Pria");
            System.out.print("Usia                          : ");
            usia = sc.nextInt();
            sc.nextLine();

            arrayDosen15[i] = new Dosen15(kode, nama, jenisKelamin, usia);
        }

        System.out.println("__________________________________________________________________________________");

        System.out.println();
        System.out.println();
        System.out.println("..................................................................................");
        System.out.println("RINCIAN DAFTAR DOSEN 1-3");
        for (Dosen15 dsn : arrayDosen15) {
            System.out.println("..................................................................................");
            System.out.println("Data Dosen " + nmr++);
            System.out.println("Kode            : " + dsn.kode);
            System.out.println("Nama            : " + dsn.nama);
            System.out.println("Jenis Kelamin   : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + dsn.usia + " tahun");
        }
        System.out.println("..................................................................................");
        System.out.println();

        DataDosen15.dataSemuaDosen(arrayDosen15);
        DataDosen15.jumlahDosenPerJenisKelamin(arrayDosen15);
        DataDosen15.rerataUsiaDosenPerJenisKelamin(arrayDosen15);
        DataDosen15.infoDosenPalingTua(arrayDosen15);
        DataDosen15.infoDosenPalingMuda(arrayDosen15);
        sc.close();
    }
}
