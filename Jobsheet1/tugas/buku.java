package tugas;

public class buku {
    public double lebar,panjang;
    int jumlahHalaman;

    buku(double lebar, double panjang, int jumlahHalaman){
        this.lebar=lebar;
        this.panjang=panjang;
        this.jumlahHalaman=jumlahHalaman;
    }

    void buka(){
        System.out.println("Buku dibuka");
    }

    void tutup(){
        System.out.println("Buku tutup");
    }
}
