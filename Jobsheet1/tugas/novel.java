package tugas;

public class novel extends buku {
    public String penerbit, judul, pengarang, tahunTerbit;

    public void dibacaSinopsis() {
        System.out.println("Berikut adalah sinopsis dari buku tersebut");
    }

    public void cariDariDaftarisi() {
        System.out.println("Mencari dari daftar isi...");
    }

    public void tandaiHalamanBaca(int halaman) {
        if (halaman > jumlahHalaman) {
            System.out.println("Halaman tidak valid");
        } else {
            System.out.println("terakhir dibaca sampai halaman = " + halaman);
        }
    }

    public void tampilInformasi() {
        System.out.println("=== Informasi Novel ===");
        System.out.println("Lebar          : " + lebar);
        System.out.println("Panjang        : " + panjang);
        System.out.println("Jumlah Halaman : " + jumlahHalaman);
        System.out.println("Warna Cover    : " + warnaCover);
        System.out.println("Berat          : " + berat);
        System.out.println("Penerbit       : " + penerbit);
        System.out.println("Judul          : " + judul);
        System.out.println("Pengarang      : " + pengarang);
        System.out.println("Tahun Terbit   : " + tahunTerbit);
    }
}