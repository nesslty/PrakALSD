package Praktikum01;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiAkhir = 0, jumlahSKS = 0, ipSemester = 0;

        String[] matkul = {"Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
        "Praktikum Dasar Pemrograman", "Agama", "PAMB"};
        int[] SKS = {2,2, 2, 2, 2, 6, 2, 2};
        int[] angka = new int[matkul.length];
        double[] bobotNilai = new double[matkul.length];
        String [] nilaiHuruf = new String[matkul.length];

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan Nilai " + matkul[i] + ": ");
            angka[i] = sc.nextInt();

            if (angka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (angka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (angka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (angka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (angka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (angka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }

            nilaiAkhir += bobotNilai[i] * SKS[i];
            jumlahSKS += SKS [i];
        }

        System.out.println("Hasil Konversi Nilai");
        System.out.println(".......................................................................................................");
        System.out.printf("%-40s %-15s %-15s %-30s\n", "Mata Kuliah ", "Nilai Angka ", "Nilai Huruf ", "Bobot Nilai ");
        System.out.println(".......................................................................................................");

        for (int i = 0; i < matkul.length; i++){
            System.out.printf("%-40s %-15d %-15s %-10.2f\n", matkul[i], angka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println(".......................................................................................................");
        ipSemester = nilaiAkhir / jumlahSKS;
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        System.out.println(".......................................................................................................");


        sc.close();
    }
}
