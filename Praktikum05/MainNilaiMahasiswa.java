package Praktikum05;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        
    int niuts [] = {78, 85, 90, 76, 92, 83, 82};
    int niuas [] = {82, 88, 87, 79, 95, 84, 84};

    NilaiMahasiswa mhs = new NilaiMahasiswa(niuts, niuas);

    int tertinggi = mhs.utsTinggi(0, niuts.length - 1);
    System.out.println("Nilai UTS tertinggi : " + tertinggi);

    int terendah = mhs.utsRendah(0, niuts.length - 1);
    System.out.println("Nilai UTS terendah  : " + terendah);

    double rrtUAS = mhs.hitungUAS();
    System.out.printf("Rata-rata nilai UAS : %.1f\n", rrtUAS);
    }
}
