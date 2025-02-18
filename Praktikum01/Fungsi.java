package Praktikum01;

import java.util.Scanner;

public class Fungsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pendapatanAkhir = 0;
        String[] tanaman = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] nominal = {75000, 50000, 60000, 10000};
        int[][] persediaan = new int[4][4];
        int[] persediaanBerkurang = {-1, -2, 0, -5};

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Masukkan stok bunga untuk setiap cabang");
            System.out.println("2. Lihat stok bunga setiap cabang");
            System.out.println("3. Lihat pendapatan dari semua cabang");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1/2/3/4): ");
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.println("Masukkan jumlah persediaan untuk setiap cabang dan tanaman:");
                for (int i = 0; i < persediaan.length; i++) {
                    System.out.println("Cabang " + (i + 1) + ":");
                    for (int j = 0; j < persediaan[i].length; j++) {
                        System.out.print(tanaman[j] + ": ");
                        persediaan[i][j] = sc.nextInt();
                    }
                }

            } else if (pilihan == 2) {
                System.out.println("Stok bunga di setiap cabang:");
                menampilkan(persediaan, tanaman);

            } else if (pilihan == 3) {
                System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
                pengurangan(persediaan, persediaanBerkurang);
                menampilkan(persediaan, tanaman);
                
                for (int i = 0; i < persediaan.length; i++) {
                    int pendapatanCabang = menghitung(persediaan, nominal, i);
                    System.out.println("Pendapatan Cabang " + (i + 1) + ": " + pendapatanCabang);
                    pendapatanAkhir += pendapatanCabang;
                }
                System.out.println("Total Pendapatan dari semua cabang jika semua bunga habis terjual: " + pendapatanAkhir);

            } else if (pilihan == 4) {
                System.out.println("Terima kasih, keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid, silakan pilih 1, 2, 3, atau 4.");
            }
        }

        sc.close();
    }

    static void pengurangan(int[][] persediaan, int[] persediaanBerkurang) {
        for (int j = 0; j < persediaanBerkurang.length; j++) {
            for (int i = 0; i < persediaan.length; i++) {
                persediaan[i][j] -= persediaanBerkurang[j]; 
            }
        }
    }

    static void menampilkan(int[][] persediaan, String[] tanaman) {
        for (int i = 0; i < persediaan.length; i++) {
            System.out.println("Persediaan tanaman di cabang " + (i + 1) + ": ");
            for (int j = 0; j < persediaan[i].length; j++) {
                System.out.println(tanaman[j] + ": " + persediaan[i][j] + " pot");
            }
            System.out.println();
        }
    }

    static int menghitung(int[][] persediaan, int[] nominal, int cabangIndex) {
        int totalPendapatan = 0;
        for (int j = 0; j < persediaan[cabangIndex].length; j++) {
            totalPendapatan += persediaan[cabangIndex][j] * nominal[j];
        }
        return totalPendapatan;
    }
}
