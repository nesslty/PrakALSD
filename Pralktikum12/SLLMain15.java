package Pralktikum12;
import java.util.Scanner;

public class SLLMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList15 sll = new SingleLinkedList15();

        System.out.print("Masukkan jumlah mahasiswa yang ingin ditambahkan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa15 mhsNew = new Mahasiswa15(nim, nama, kelas, ipk);
            sll.addLast(mhsNew);
        sll.print();
        }
        sc.close();
    }
}
