package tugas;

public class buku {
    public double lebar, panjang;
    public int jumlahHalaman;
    public String warnaCover, berat;

    public void buka() {
        System.out.println("Buku dibuka");
    }

    public void tutup() {
        System.out.println("Buku tutup");
    }

    public void dibaca() {
        System.out.println("Buku sedang dibaca");
    }

    public void ditulisi(){
        System.out.println("Dituliskan pada halaman buku...");
    }

    public void tampilInformasi() {
        System.out.println("=== Informasi Buku ===");
        System.out.println("Lebar         : " + lebar);
        System.out.println("Panjang       : " + panjang);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Warna Cover   : " + warnaCover);
        System.out.println("Berat         : " + berat);
    }
}