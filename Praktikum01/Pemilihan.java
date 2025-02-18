package Praktikum01;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, kuis, UTS, UAS, akhir;
        String huruf;
        System.out.println(".......................................................");
        System.out.println("MASUKKAN NILAI-NILAI ANDA DALAM RENTANG ANGKA 0-100");
        System.out.println(".......................................................");

        System.out.print("Nilai tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Nilai kuis: ");
        kuis = sc.nextDouble();
        System.out.print("Nilai UTS: ");
        UTS = sc.nextDouble();
        System.out.print("Nilai UAS: ");
        UAS = sc.nextDouble();

        System.out.println("........................................................");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100){ 
            System.out.println("nilai tidak valid");
        } 

        akhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * UTS) + (0.4 * UAS);
        System.out.println("Nilai akhirnya adalah " + akhir);

        if (akhir > 80) {
            huruf = "A";
        } else if (akhir > 73) {
            huruf = "B+";
        } else if (akhir > 65) {
            huruf = "B";
        } else if (akhir > 60) {
            huruf = "C+";
        } else if (akhir > 50) {
            huruf = "C";
        } else if (akhir > 39) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        System.out.println("Simbol huruf: " + huruf);
        System.out.println(".......................................................");

        if (huruf.equals("A") || huruf.equals("B+") || huruf.equals("B") || huruf.equals("C+") || huruf.equals("C")) {
            System.out.println("LULUS");
        } else {
            System.out.println("MOHON MAAF BELUM LULUS");
        }

        sc.close();
    }
}
