package Praktikum05;

public class NilaiMahasiswa {
    int nilaiUTS [];
    int nilaiUAS [];

    public NilaiMahasiswa(int niuts[], int niuas[]) {
        nilaiUTS = niuts;
        nilaiUAS = niuas;
    }

    int tertinggi (int a, int b) {
        return(a > b) ? a : b;
    }
    int utsTinggi (int a, int b) {
        if (a == b) {
            return nilaiUTS[a];
        }
        int ttl = (a + b) / 2;
        int tga = utsTinggi(a, ttl);
        int tgb = utsTinggi(ttl + 1, b);
        return tertinggi (tga, tgb);
    }

    int terendah (int a, int b) {
        return(a < b) ? a : b;
    }
    int utsRendah (int a, int b) {
        if ( a == b) {
            return nilaiUTS[b];
        }
        int ttl = (a + b) / 2;
        int tga = utsRendah(a, ttl);
        int tgb = utsTinggi(ttl + 1, b);
        return terendah (tga, tgb);
    }

    double hitungUAS () {
        int ttl = 0;
        for (int nilai : nilaiUAS) {
            ttl += nilai;
        }
        return (double) ttl / nilaiUAS.length;
    }
}
