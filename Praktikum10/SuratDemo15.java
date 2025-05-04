package Praktikum10;

import java.util.Scanner;

public class SuratDemo15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat15 stackSurat = new StackSurat15(20);

        int pilih;
        do {
            System.out.println("\nMenu Surat Izin:");
            System.out.println("1. Tambah Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    stackSurat.terimaSurat(id, nama, kelas, jenis, durasi);
                    break;

                case 2:
                    stackSurat.prosesSurat();
                    break;

                case 3:
                    stackSurat.lihatSuratTerakhir();
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String namaCari = scan.nextLine();
                    stackSurat.cariSurat(namaCari);
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        scan.close();
    }
}
