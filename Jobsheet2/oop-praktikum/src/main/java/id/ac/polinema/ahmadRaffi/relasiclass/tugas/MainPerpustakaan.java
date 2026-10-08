public class MainPerpustakaan {
    public static void main(String[] args) {

        // Buku dibuat dari luar Peminjaman
        Buku buku = new Buku("Algoritma dan Struktur Data", "Andi");

        // Aggregation
        Peminjaman peminjaman =
                new Peminjaman("24 September 2026", buku);

        // Dependency
        Anggota anggota = new Anggota("Raffi");
        anggota.pinjamBuku(peminjaman);

        System.out.println();

        // Composition
        Perpustakaan perpustakaan =
                new Perpustakaan("Perpustakaan Polinema");

        perpustakaan.info();
    }
}