public class Anggota {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    public void pinjamBuku(Peminjaman peminjaman) {
        // DEPENDENCY
        System.out.println(nama + " melakukan peminjaman.");
        peminjaman.info();
    }
}