import java.util.Scanner;
public class Dosen15Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen15 dataDosen = new DataDosen15();

        while (true) {
            System.out.println("===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Cari Dosen berdasarkan Nama");
            System.out.println("4. Cari Dosen berdasarkan Usia");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();
        
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode dosen   : ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan nama dosen   : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan jenis kelamin (true=Laki-laki / false=Perempuan): ");
                    boolean jenisKelamin = input.nextBoolean();
                    System.out.print("Masukkan usia dosen   : ");
                    int usia = input.nextInt();
                    input.nextLine();

                    Dosen15 dosenBaru = new Dosen15(kode, nama, jenisKelamin, usia);
                    dataDosen.tambah(dosenBaru);
                    System.out.println("Data dosen berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("===== DATA DOSEN =====");
                    dataDosen.tampil();
                    break;

                case 3:
                    System.out.println("Masukkan nama dosen yang dicari: ");
                    String cariNama = input.nextLine();
                    dataDosen.searchNama(cariNama);
                    break;

                case 4:
                    System.out.println("Masukkan usia dosen yang dicari: ");
                    int cariUsia = input.nextInt();
                    dataDosen.searchUsia(cariUsia);
                    break;
                
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}
