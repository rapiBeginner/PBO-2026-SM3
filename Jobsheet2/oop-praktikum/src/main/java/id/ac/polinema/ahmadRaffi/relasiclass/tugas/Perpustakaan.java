public class Perpustakaan {
    private String nama;
    private Buku buku;

    public Perpustakaan(String nama) {
        this.nama = nama;

        // COMPOSITION
        this.buku = new Buku("Pemrograman Java", "Budi");
    }

    public void info() {
        System.out.println("Perpustakaan: " + nama);
        buku.info();
    }
}