package Praktikum10;
import java.util.Scanner;
public class SuratDemo15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        StackSurat15 stack = new StackSurat15(pilih);
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat Tugas");
            System.out.println("4. Melihat daftar tugas");
            System.out.print("Pilih: ");
        }
        scan.close();
    }
}
