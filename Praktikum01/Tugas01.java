package Praktikum01;

import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] kota = {"Banten", "Jakarta", "Bandung", "Cirebon", "Bogor", "Pekalongan", "Semarang", "Surabaya", "Malang", "Tegal"};
        
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("========== MENU UTAMA ===========");
            System.out.println("1. Tampilkan semua kode plat dan kota");
            System.out.println("2. Cari kota berdasarkan kode plat");
            System.out.println("3. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("=== Daftar Kode Plat dan Kota ===");
                    for (int i = 0; i < kode.length; i++) {
                        System.out.println(kode[i] + " - " + kota[i]);
                    }
                    System.out.println("=================================");
                    break;
                case 2:
                    System.out.print("Masukkan kode plat nomor: ");
                    char inputKode = sc.next().charAt(0);
                    boolean found = false;
                    for (int i = 0; i < kode.length; i++) {
                        if (kode[i] == inputKode) {
                            System.out.println("Nama kota: " + kota[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Kode plat nomor tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini. Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 3);
        
        sc.close();
    }
}

