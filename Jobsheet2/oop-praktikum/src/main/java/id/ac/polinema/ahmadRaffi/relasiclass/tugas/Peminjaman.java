public class Peminjaman {
    private String tanggal;
    private Buku buku;

    public Peminjaman(String tanggal, Buku buku) {
        this.tanggal = tanggal;

        // AGGREGATION
        this.buku = buku;
    }

    public void info() {
        System.out.println("Tanggal peminjaman: " + tanggal);
        System.out.println("Buku yang dipinjam: " + buku.getJudul());
    }
}