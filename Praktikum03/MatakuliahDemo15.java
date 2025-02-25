package Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah15[ ] arrayMataKuliah15 = new MataKuliah15[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("_________________________________________________________________________________");
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            kode = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("SKS: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);


            arrayMataKuliah15[i] = new MataKuliah15(kode, nama, sks, jumlahJam);
        }
        System.out.println("_________________________________________________________________________________");

        System.out.println();
        System.out.println();
        System.out.println("..................................................................................");
        System.out.println("RINCIAN DAFTAR MATA KULIAH 1-3");
        for (int i = 0; i < 3; i++) {
            System.out.println("..................................................................................");
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode: " + arrayMataKuliah15[i].kode);
            System.out.println("Nama: " + arrayMataKuliah15[i].nama);
            System.out.println("SKS: " + arrayMataKuliah15[i].sks);
            System.out.println("Jumlah jam: " + arrayMataKuliah15[i].jumlahJam);

        }
        System.out.println("..................................................................................");
        sc.close();
    }
}
