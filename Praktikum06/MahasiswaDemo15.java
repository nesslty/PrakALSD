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

        //melakukan pencarian data binary
        System.out.println("---------------------------------------------------------");
        System.out.println("pencarian data");
        System.out.println("---------------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        double cari = input.nextDouble();
        System.out.println("---------------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("---------------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        input.close();
    }
}
