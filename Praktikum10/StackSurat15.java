package Praktikum10;

public class StackSurat15 {
    Surat15[] stack;
    int top;
    int size;

    public StackSurat15(int size) {
        this.size = size;
        stack = new Surat15[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat15 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat15 pop() {
        if (!isEmpty()) {
            Surat15 surat = stack[top];
            stack[top] = null;
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk divalidasi.");
            return null;
        }
    }

    public Surat15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang divalidasi");
            return null;
        }
    }

    public void terimaSurat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        Surat15 suratBaru = new Surat15(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
        push(suratBaru);
        System.out.println("Surat berhasil ditambahkan.");
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampilkanSurat();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama: " + nama + "tidak ditemukan.");
        }
    }

    public void prosesSurat() {
        Surat15 suratDiproses = pop();
        if (suratDiproses != null) {
            suratDiproses.tampilkanSurat();
        }
    }

    public void lihatSuratTerakhir() {
        Surat15 suratTerakhir = peek();
        if (suratTerakhir != null) {
            System.out.println("Surat terakhir:");
            suratTerakhir.tampilkanSurat();
        }
    }
}
