package Praktikum03;

public class DataDosen15 {
    public void dataSemuaDosen(Dosen15[] arrayDosen15) {
        System.out.println();
        System.out.println("..................................................................................");
        System.out.println("DAFTAR SEMUA DOSEN:");
        for (Dosen15 dsn : arrayDosen15) {
            System.out.println("Kode            : " + dsn.kode); 
            System.out.println("Nama            : " + dsn.nama);
            System.out.println("Jenis Kelamin   : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + dsn.usia);
            System.out.println("..................................................................................");
            System.out.println();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen15[] arrayDosen15) {
        int pria = 0, wanita = 0;
        for (Dosen15 dsn : arrayDosen15) {
            if (dsn.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        
        System.out.println();
        System.out.println("..................................................................................");
        System.out.println("Jumlah Dosen Pria   : " + pria + " orang");
        System.out.println("Jumlah Dosen Wanita : " + wanita + " orang");
        System.out.println("..................................................................................");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen15[] arrayDosen15) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, jumlahPria = 0, jumlahWanita = 0;
        for (Dosen15 dsn : arrayDosen15) {
            if (dsn.jenisKelamin) {
                totalUsiaPria += dsn.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                jumlahWanita++;
            }
        }

        System.out.println("Rata-rata usia dosen Pria   : " + (jumlahPria > 0 ? (totalUsiaPria / jumlahPria) : 0) + " tahun");
        System.out.println("Rata-rata usia dosen Wanita : " + (jumlahWanita > 0 ? (totalUsiaWanita / jumlahWanita) : 0) + " tahun");
        System.out.println("..................................................................................");

    }

    public void infoDosenPalingTua(Dosen15[] arrayDosen15) {
            Dosen15 tertua = arrayDosen15[0];
            for (Dosen15 dsn : arrayDosen15) {
                if (dsn.usia > tertua.usia) {
                    tertua = dsn;
                }
            }
            
            System.out.println("DOSEN PALING TUA");
            System.out.println("Nama Dosen: " + tertua.nama);
            System.out.println("Umur dosen: " + tertua.usia + " tahun");
            System.out.println("..................................................................................");
            
    }

    public void infoDosenPalingMuda(Dosen15[] arrayDosen15) {
        Dosen15 termuda = arrayDosen15[0];
        for (Dosen15 dsn : arrayDosen15) {
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }
        System.out.println("DOSEN PALING MUDA");
        System.out.println("Nama Dosen: " + termuda.nama);
        System.out.println("Umur dosen: " + termuda.usia + " tahun");
        System.out.println("..................................................................................");
        System.out.println();
    }
}

