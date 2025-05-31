package Praktikum13;
import java.util.Scanner;
public class DLLMain15 {
    public static void main (String[] args) {
        DoubleLinkedList15 list = new DoubleLinkedList15();
        Scanner scan = new Scanner (System.in);
        int pilihan;


        do {
            System.out.println("\nMenu DOuble Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.println("Pilihan Menu");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1 -> {
                Mahasiswa15 mhs = inputMahasiswa(scan);
                list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa15 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    scan.nextLine();
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node15 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 0 -> System.out.println("keluar dari program");
                default -> System.out.println("pilihan tidak falid");
            }
        } while (pilihan != 0);
        scan.close();
    }
}
