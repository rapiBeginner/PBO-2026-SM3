package tugas;

public class novel extends buku {
    public String penerbit, judul, pengarang, tahunTerbit;

   public void dibacaSinopsis(){
        System.out.println("Berikut adalah sinopsis dari buku tersebut");
    }

    public void cariDariDaftarisi(){
        System.out.println("Mencari dari daftar isi...");
    }

    public void tandaiHalamanBaca(int halaman) {
        if (halaman > jumlahHalaman) {
            System.out.println("Halaman tidak valid");
        } else {
            System.out.println("terakhir dibaca sampai halaman = " + halaman);
        }
    }
}