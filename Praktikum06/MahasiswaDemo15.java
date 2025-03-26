import java.util.Locale;
import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        int jumMhs = 5;
        
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15(jumMhs);
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            String ip = input.nextLine();
            Double ipk = Double.parseDouble(ip);

            System.out.println("---------------------------------------------------------");;
            list.tambah(new Mahasiswa15(nim, nama, kelas, ipk));
        }

        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("---------------------------------------------------------");
        System.out.println("pencarian data");
        System.out.println("---------------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();
        input.nextLine();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        input.close();
    }
}
