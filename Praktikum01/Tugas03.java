package Praktikum01;

import java.util.Scanner;

public class Tugas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama mata kuliah: ");
            namaMataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("Pilih opsi:");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Mencari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.println("Jadwal Kuliah:");
                for (int i = 0; i < n; i++) {
                    System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
                    System.out.println("SKS: " + sks[i]);
                    System.out.println("Semester: " + semester[i]);
                    System.out.println("Hari: " + hariKuliah[i]);
                    System.out.println();
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan hari yang ingin ditampilkan: ");
                String hari = sc.nextLine();
                System.out.println("Jadwal kuliah pada hari " + hari + ":");
                boolean adaJadwal = false;
                for (int i = 0; i < n; i++) {
                    if (hariKuliah[i].equalsIgnoreCase(hari)) {
                        System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
                        System.out.println("SKS: " + sks[i]);
                        System.out.println("Semester: " + semester[i]);
                        System.out.println();
                        adaJadwal = true;
                    }
                }
                if (!adaJadwal) {
                    System.out.println("Tidak ada jadwal kuliah pada hari " + hari + ".");
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan semester yang ingin ditampilkan: ");
                int smstr = sc.nextInt();
                System.out.println("Jadwal kuliah pada semester " + smstr + ":");
                boolean adaJadwal = false;
                for (int i = 0; i < n; i++) {
                    if (semester[i] == smstr) {
                        System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
                        System.out.println("SKS: " + sks[i]);
                        System.out.println("Hari: " + hariKuliah[i]);
                        System.out.println();
                        adaJadwal = true;
                    }
                }
                if (!adaJadwal) {
                    System.out.println("Tidak ada jadwal kuliah pada semester " + smstr + ".");
                }
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                String namaCari = sc.nextLine();
                boolean ditemukan = false;
                for (int i = 0; i < n; i++) {
                    if (namaMataKuliah[i].equalsIgnoreCase(namaCari)) {
                        System.out.println("Mata Kuliah ditemukan:");
                        System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
                        System.out.println("SKS: " + sks[i]);
                        System.out.println("Semester: " + semester[i]);
                        System.out.println("Hari: " + hariKuliah[i]);
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Mata kuliah dengan nama '" + namaCari + "' tidak ditemukan.");
                }
            } else if (pilihan == 5) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
        
        sc.close();
    }
}
