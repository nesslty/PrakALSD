public class DataDosen15 {
    Dosen15[] dataDosen;
    int idx;

    DataDosen15() {
        dataDosen = new Dosen15[10]; 
        idx = 0;
    }

    void tambah(Dosen15 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen15 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void searchNama(String nama) {
        boolean found = false;
        int jumlahData = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                found = true;
                jumlahData++;
            }
        }
        if (!found) {
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan");
        } else if (jumlahData > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama yang sama!");
        }
    }

    void searchUsia (int usia) {
        sortingASC();
        int kiri = 0, kanan = idx - 1;
        boolean found = false;
        int jumlahData = 0;

        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;
            if (dataDosen[tengah].usia == usia) {
                int i = tengah;

                while (i <= kanan && dataDosen[i].usia == usia) {
                    dataDosen[i].tampil();
                    i++;
                    jumlahData++;
                }
                found = true;
                break;
            } else if (dataDosen[tengah].usia < usia) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }
        if (!found) {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan");
        } else if (jumlahData > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia yang sama");
        } 
    }
}
