package Praktikum01;

import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisPilihan;
        double sisi;

        System.out.println("KALKULATOR KUBUS");
        System.out.println("1. Hitung Volume");
        System.out.println("2. Hitung Luas Permukaan");
        System.out.println("3. Hitung Keliling");
        System.out.println("4. Keluar");

        do {
            System.out.print("Masukkan angka dari salah satu dari pilihan 1 - 4: ");
            jenisPilihan = sc.nextInt();

            if (jenisPilihan >= 1 && jenisPilihan <= 3) {
                System.out.print("Panjang sisi: ");
                sisi = sc.nextDouble();
                hitungKubus(jenisPilihan, sisi);
            } else if (jenisPilihan == 4) {
                System.out.println("Terima kasih");
            } else {
                System.out.println("Tidak valid, silahkan coba lagi.");
            }
        } while (jenisPilihan != 4);
        
        sc.close();
    }

    public static void hitungKubus(int jenisPilihan, double sisi) {
        switch (jenisPilihan) {
            case 1:
                System.out.println("Hasil volume Kubus: " + (sisi * sisi * sisi));
                break;
            case 2:
                System.out.println("Hasil luas Permukaan Kubus: " + (6 * sisi * sisi));
                break;
            case 3:
                System.out.println("Hasil keliling Kubus: " + (12 * sisi));
                break;
        }
    }
}

        