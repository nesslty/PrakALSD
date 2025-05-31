package Praktikum12;
import java.util.Scanner;

public class TugasAntrianMain15 {
    public static void main(String[] args) {
        TugasQueueLinkedList15 antrian = new TugasQueueLinkedList15();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println(" === Menu Antrian Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan keperluan: ");
                    String keperluan  = sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    antrian.enqueue(new TugasMahasiswa15(nim, nim, keperluan));
                    break;
                
                case 2:
                    antrian.dequeue();

                case 3:
                    antrian.peekTerdepan();

                case 4:
                    antrian.peekTerakhir();

                case 5:
                    antrian.tampilData();

                case 6:
                    System.out.println("Jumlah mahasiswa yang masih antri: ");
                    antrian.jumlahMahasiswa();

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Selesai, terima kasih");

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);

        sc.close();
    }
}
