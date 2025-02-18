package Praktikum01;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long NIM, angka;
        System.out.print("Silahkan masukkan NIM anda: ");
        NIM = sc.nextLong();
        angka = NIM % 100;

        if (angka < 10) {
            angka += 10;
        }

        System.out.println("angka: " + angka);

        for (int i = 1; i <= angka; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("*");
            }
        }
        
        sc.close();
    }
}
