package Pralktikum12;

public class TugasMahasiswa15 {
    String nim;
    String nama;
    String keperluan;
    
    public TugasMahasiswa15 (String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilInformasi() {
    System.out.println(nama + "\t" + nim + "\t" + keperluan);
    }
}
